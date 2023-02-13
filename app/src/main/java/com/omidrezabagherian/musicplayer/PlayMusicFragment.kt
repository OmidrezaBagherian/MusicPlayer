package com.omidrezabagherian.musicplayer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omidrezabagherian.musicplayer.databinding.FragmentPlayMusicBinding

class PlayMusicFragment : Fragment(R.layout.fragment_play_music) {

    private lateinit var playMusicBinding: FragmentPlayMusicBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        playMusicBinding = FragmentPlayMusicBinding.bind(view)

        super.onViewCreated(view, savedInstanceState)
    }
}