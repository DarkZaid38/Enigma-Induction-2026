package com.maharana.notesapp.utils

import android.media.MediaPlayer

class AudioPlayer {
    private var mediaPlayer: MediaPlayer? = null
    private var isAudioPlaying = false

    fun startPlaying(audioPath: String, onCompletion: () -> Unit) {
        stopPlaying()
        try {
            mediaPlayer = MediaPlayer().apply {
                setDataSource(audioPath)
                prepare()
                start()
                setOnCompletionListener {
                    isAudioPlaying = false
                    onCompletion()
                    stopPlaying()
                }
            }
            isAudioPlaying = true
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun stopPlaying() {
        mediaPlayer?.apply {
            if (isPlaying) {
                stop()
            }
            release()
        }
        mediaPlayer = null
        isAudioPlaying = false
    }

    fun isPlaying(): Boolean = isAudioPlaying
}
