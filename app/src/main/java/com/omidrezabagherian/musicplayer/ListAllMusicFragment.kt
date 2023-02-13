package com.omidrezabagherian.musicplayer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omidrezabagherian.musicplayer.databinding.FragmentListAllMusicBinding

class ListAllMusicFragment : Fragment(R.layout.fragment_list_all_music) {

    private lateinit var listAllMusicBinding: FragmentListAllMusicBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        listAllMusicBinding = FragmentListAllMusicBinding.bind(view)

        super.onViewCreated(view, savedInstanceState)
    }
}