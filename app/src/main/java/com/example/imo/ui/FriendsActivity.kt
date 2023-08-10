package com.example.imo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imo.R
import com.example.imo.adapter.ChatAdapter
import com.example.imo.model.Question
import com.example.imo.model.User

class FriendsActivity : AppCompatActivity() {
    lateinit var userList:ArrayList<User>
    lateinit var questions: ArrayList<Question>
    var count = 0
    var selected = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        initViews()
    }


    private fun initViews() {
        loadList()

        val rvChatList=findViewById<RecyclerView>(R.id.rv_chat_list)
        rvChatList.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rvChatList.adapter= ChatAdapter(userList)

    }

    private fun loadList() {
        userList= ArrayList()
        userList.add(User("https://w0.peakpx.com/wallpaper/528/193/HD-wallpaper-macaw-parrot-animals-birds.jpg","Yellow Ara","today","Hi bro,, How are you today?", true))
        userList.add(User("https://i.pinimg.com/736x/47/c5/ba/47c5ba661185c86e71f780216341b508.jpg","Karella","today","Hi bro,, How are you today?", true))
        userList.add(User("https://png.pngtree.com/background/20230518/original/pngtree-beautiful-parrot-sitting-on-a-branch-picture-image_2645435.jpg","Budgie","today","Hi bro,, How are you today?", true))
        userList.add(User("https://cache.lovethispic.com/uploaded_images/330700-White-Parrot.jpg","Kakadu","today","Hi bro,, How are you today?", true))
        userList.add(User("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ69VgwFp0ZsJ74FZGFXiBt3vszqmIzjKC0Nw&usqp=CAU","Giazint Ara","today","Hi bro,, How are you today?", true))
        userList.add(User("https://im.indiatimes.in/media/content/2015/Aug/angry-parroyt_1439892652.jpg","Ожереловый попугай","today","Hi bro,, How are you today?", true))
        userList.add(User("https://www.thesprucepets.com/thmb/jwiU8xjRwYx8qgIb0z3Sh9rhgrs=/420x294/filters:no_upscale():strip_icc()/major-mitchell-cockatoo-531758203-638f3fdb0fcf4571a551acbdfa2b2763.jpg","Pink Ara","today","Hi bro,, How are you today?", true))
        userList.add(User("https://thumbs.dreamstime.com/b/three-lovebird-parrots-sit-clinging-to-each-other-brushing-their-feathers-three-lovebird-parrots-sit-clinging-to-each-other-161227665.jpg","Неразручники","today","Hi bro,, How are you today?", true))
        userList.add(User("https://petkeen.com/wp-content/uploads/2021/08/Jenday-Conure-Cute_kingma-photos_Shutterstock-760x506.jpg","Sunny Ara","today","Hi bro,, How are you today?", true))
        userList.add(User("https://amazingbirdbreeders.com/wp-content/uploads/2022/08/Talking-Parrot-sale.jpeg","Амазон","today","Hi bro,, How are you today?", true))
        userList.add(User("https://i.pinimg.com/736x/06/85/02/0685020392dbfcca4f5c4a05727ed1a1.jpg","Какапо","today","Hi bro,, How are you today?", true))
        userList.add(User("https://i.redd.it/dhs9p7t7u3p51.jpg","Какапо","today","Hi bro,, How are you today?", true))
    }
}