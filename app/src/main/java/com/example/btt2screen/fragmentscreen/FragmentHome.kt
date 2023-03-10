package com.example.btt2screen.fragmentscreen

import android.net.IpSecAlgorithm
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DiffUtil
import com.example.btt2screen.DataStore
import com.example.btt2screen.Image
import com.example.btt2screen.R
import com.example.btt2screen.RecyclerviewViewModel
import com.example.btt2screen.adapter.ImageAdapter
import com.example.btt2screen.adapter.OnImageItemListener
import com.example.btt2screen.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {
    lateinit var binding: FragmentHomeBinding
    lateinit var adapter: ImageAdapter
    lateinit var viewModel: RecyclerviewViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nvProfile.setOnClickListener {
            val controller = findNavController()
            controller.navigate(R.id.action_fragmentHome_to_fragmentProfile)
        }
        viewModel = ViewModelProvider(this)[RecyclerviewViewModel::class.java]

        setUpRecyclerView()
        setUpViewModelObservers()

    }
    private fun setUpViewModelObservers() {
        viewModel.menuLayoutType.observe(viewLifecycleOwner){
            binding.rvImage.layoutManager = viewModel.getLayout(activity)
        }

        viewModel.newList.observe(viewLifecycleOwner){
            setList(it)
        }
    }
    private fun setUpRecyclerView() {
        binding.rvImage.layoutManager = viewModel.getLayout(activity);
        adapter = ImageAdapter(onImageItemListener)
        binding.rvImage.adapter = adapter
        run {
            adapter.submitList(DataStore.Restaurant.value)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        viewModel.setLayout(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private val onImageItemListener  = object : OnImageItemListener {
        override fun onClickItem(item: View, restaurant: Image) {
            viewModel.handleItemWhenClicked(item,restaurant)
        }

        override fun onLongClick(item: View) {
            viewModel.handleItemWhenLongClicked(item)
        }
    }
    private fun setList(newList: MutableList<Image>) {
        DataStore.Restaurant.value?.let {
            ImageAdapter.ImageDiffUtilCallback(
                it,
                newList
            )
        }
            ?.let { DiffUtil.calculateDiff(it).dispatchUpdatesTo(adapter) }
        DataStore.Restaurant.value?.clear()
        DataStore.Restaurant.value?.addAll(newList)
    }
}
