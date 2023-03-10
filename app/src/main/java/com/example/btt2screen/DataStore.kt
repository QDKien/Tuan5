package com.example.btt2screen

import androidx.lifecycle.MutableLiveData


class DataStore {
    companion object {
        var userDataStore: MutableList<MutableMap<String, String>> = mutableListOf(mutableMapOf(
            "fullName" to "Eljad Eendaz",
            "email" to "username@gmail.com",
            "password" to "12345678",
            "phoneNumber" to "+1 (783) 0986 8786"
        ))
        val currentUserData: MutableLiveData<MutableMap<String, String>> = MutableLiveData()
        val Restaurant: MutableLiveData<MutableList<Image>> = MutableLiveData(mutableListOf(

            Image(
                147114, "Pizza Hut", "OrderDelivered", "https://s3-alpha-sig.figma.com/img/6a45/b905/e7a52356646905ddfd7a8c811ba3c601?Expires=1679270400&Signature=iiG7N5k1uzE1h7Z0hhQUuUJiRcHOyyFTBWYFaE-e9o5fcqojy2SekU8ACSdGbOkbdAbT8RG5APuW7eykZrUomFDkAcolDU-9RMtzraBPU2p91y4Okp1PBaeZBy9xtljoj9Bev2wiKvczOXPYZzuvXS0SwUbNh6N1Lku82tNEj0fdnvjrr5udnuGnaJeCqcia7M~F15mmL3ZCDKY5-M~ePaWnMOZVyL~aeWscXn7PH6B8kZQ3kRzP6i008dS6NbnGGgBKDiTDXoUrjjrt3zvI69LlebCW1DVxJpe2N0yoB9JCUmjXY1VMXls~InXUg6LWUp4d7akS5DB-krt08toSUw__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4", "$15.30"
            ),
            Image(
                91979	,"Burger King"	,"OrderDelivered"	,"https://s3-alpha-sig.figma.com/img/4dd0/2f27/2af7f6c51095c10b1d01a723025d2d5b?Expires=1679270400&Signature=QtGunW6TWbtN2hoIe00EfxNofhkd7HJ0NDlN2EW2Q68CwtGXCyuidxTNo6KFGoc6pAsfp0LtHRvAGrfi9fP9gSLn~q-M1JRu6oUJD3Mcsc7mNIQahRYIqNu90u5RLOcXr07EVgszmdst~ell855JhGc3pijblAEsvdMQoJD66DZMHPY8rxKvXmZA4v80Pcz4f3u1v-kDJb0vteHzako17ySaQrOWlEnUPaxMvGs6jF0VQNEg8xzSbmx1ZGzM88~uzalvFXKVED54Umiy1OslGz3BOWhITlroG80-O0fQqEgehMDcXTxP9XrnIXRrkL76KyoX6DNn3DG50FWuC1gGvg__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4", "$50.20"

            ),
            Image(
                129725	,"KFC"	,"Cancel"	,"https://s3-alpha-sig.figma.com/img/0762/fccc/b18df3bf28a57c55655e97fe8f5949c7?Expires=1679270400&Signature=F71aLx1PdyA2nHzuD9Q8SUYiLYmPcPVSwexVj-BNFHPKTsKUKL5GJsr2FLNuraXLiVc87meVlcvd4oTh111jGbA4GkhQmSXshsLXGTMQfkbSxCLLPmnYzshYdv3KjF2mhbEWuhVZbcVfpBrO3D6-K~Pyczr~Zt~iZqfjU2h8nz3tt5KvCR0fIqym-K4R3MLbZsXSA1o2xY1BFgq~evtDuyLOtN1xYYcHzrcWy2egHmilChqbChyQ-HGaYLDvVjQJmLjjVgywxE5ZETEpB~HEZQfiIWJ4pBc2MmQpJMzvqetoHYUCaHZFpKmAuqwaN3D5-vLWG182QUqL65QDtYIGng__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4","$10.00"

            ),
            Image(
                158187	,"Starbuck"	,"OrderDelivered"	,"https://s3-alpha-sig.figma.com/img/45e2/09f9/e727e43e2ab320783f1215031d8e7eba?Expires=1679270400&Signature=eX7dD4ilTA5iYpVkxZWzfTTW6KlKfXRu~aAtZIr-MAmAk9d6LkgRRTpperNkd-AC4o2pDpu3dDr3f9-VukeVjMC9yXgRJ9HygkULh9l4C-KFzbv2t0UFp442NfZ2Ew7rcDdfHPSSMWKC2htypDHmlEjiF-YUoy3xRIs7gddgXX6qPRfKfYfqR7p7neYQOmpnZUVtd2dcCLLdoETqK~z6ShoUNVo55MVpvj8AGa-08c5yCj3C8S1xpen4F8RcfNvqCl1DR8jej2P6kHUYHMeb02ijZHgGIzF5tdy80kJqzFh0W6~RVMUrZwzl1H4QgqN5Tlm8vxU-25w06TWjOiMMUQ__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4","$15.30"

            ),
            Image(
                232015	,"Cowboy Jack's"	,"Tầng 1, Lotte Mart Gò Vấp, 242 Nguyễn Văn Lượng, P. 10"	,"https://images.foody.vn/res/g24/232015/prof/s640x400/foody-mobile-untitled-1-jpg-931-636143900507885296.jpg"
                ,""
            ),
//5

            Image(
                260306	,"Nhà Hàng Đùi Cừu Nướng"	,"395/2 Tân Sơn"	,"https://images.foody.vn/res/g27/260306/prof/s640x400/foody-mobile-c2-jpg-506-636051429704140905.jpg"
                ,""
            ),
            Image(
                632537	,"Cơm Niêu Thanh Dung"	,"Tầng B1 Vincom Quang Trung, 190 Quang Trung, P. 10"	,"https://images.foody.vn/res/g64/632537/prof/s640x400/foody-mobile-foody-com-nieu-thanh-267-636226007562347658.jpg"
                ,""
            ),
            Image(
                243022	,"Rest"	,"233 Phạm Văn Đồng, P. 1"	,"https://images.foody.vn/res/g25/243022/prof/s640x400/foody-mobile-yummy-pucca-tra-sua--608-636008184788294962.jpg"
                ,""
            ),
            Image(
                241191	,"Mì Cay & Cơm Chảo"	,"36 Đường 18, P. 8"	,"https://images.foody.vn/res/g25/241191/prof/s640x400/foody-mobile-1-jpg-859-636004798869374643.jpg"
                ,""
            ),
            Image(
                102771	,"Cơm Tấm Loan"	,"346 Nguyễn Thái Sơn"	,"https://images.foody.vn/res/g11/102771/prof/s640x400/foody-mobile-mobile-jpg-273-636192952803833507.jpg"
                ,""
            ),
//10

            Image(
                741810	,"Alô Cú Đêm - Ăn Đêm Online"	,"590/2/10 Phan Văn Trị, P. 7"	,"https://images.foody.vn/res/g75/741810/prof/s640x400/foody-upload-api-foody-mobile-hmbbd-jpg-180516153516.jpg"
                ,""
            ),
            Image(
                646398	,"3T - Trà Sữa"	,"Hẻm 904 Nguyễn Kiệm, P. 3"	,"https://images.foody.vn/res/g65/646398/prof/s640x400/foody-mobile-t1-jpg-847-636262083036898539.jpg"
                ,""
            ),
            Image(
                198048	,"Mahalo Beer Club"	,"97 Quang Trung, P. 8"	,"https://images.foody.vn/res/g20/198048/prof/s640x400/foody-mobile-vinalo-1423450460c37-327-635864877923035553.jpg"
                ,""
            ),
            Image(
                914781	,"Avatar Coffee & Tea"	,"27 Nguyễn Văn Nghi, P. 4"	,"https://images.foody.vn/res/g92/914781/prof/s640x400/foody-upload-api-foody-mobile-hjhjjh-190529101415.jpg"
                ,""
            ),
            Image(
                78170	,"New Town Cafe"	,"226 Phạm Văn Đồng"	,"https://images.foody.vn/res/g8/78170/prof/s640x400/foody-mobile-31pjp7xp-jpg-544-636173040922508723.jpg"
                ,""),
//15

            Image(
                147404	,"Cháo Ếch Sư Phụ Singapore"	,"143 Quang Trung, P. 10"	,"https://images.foody.vn/res/g15/147404/prof/s640x400/foody-mobile--20-_hinhmob-jpg-581-635711966218063586.jpg"
                ,""),
            Image(
                243368	,"Stir Crazy - Mongolian Grill/BBQ"	,"890 Quang Trung, P. 8"	,"https://images.foody.vn/res/g25/243368/prof/s640x400/foody-mobile-wa9x98f1-jpg-460-636027099847602421.jpg"

                ,""),
            Image(
                763311	,"Dumi Food & Cafe"	,"777 Quang Trung, P. 12"	,"https://images.foody.vn/res/g77/763311/prof/s640x400/foody-upload-api-foody-mobile-6-190103151548.jpg"
                ,""
            ),
            Image(
                228077	,"Lê Uyên - Trà Sữa Thạch Nhà Làm"	,"497 Thống Nhất, P. 16"	,"https://images.foody.vn/res/g23/228077/prof/s640x400/foody-mobile-c2-jpg-269-635962229479969754.jpg"
                ,""
            ),
            Image(
                178062	,"Dê Tươi Mái Lá"	,"1 Huỳnh Văn Nghệ, P. 12"	,"https://images.foody.vn/res/g18/178062/prof/s640x400/foody-mobile-hmb-h-jpg-622-635809354088548078.jpg"
                ,""
            ),
//20
        ))
    }
}


