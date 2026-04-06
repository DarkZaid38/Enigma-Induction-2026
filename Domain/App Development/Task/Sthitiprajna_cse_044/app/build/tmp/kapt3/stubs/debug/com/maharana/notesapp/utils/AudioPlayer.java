package com.maharana.notesapp.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u0006J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/maharana/notesapp/utils/AudioPlayer;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isAudioPlaying", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "isPlaying", "startPlaying", "", "audioPath", "", "onCompletion", "Lkotlin/Function0;", "stopPlaying", "app_debug"})
public final class AudioPlayer {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable
    private android.media.MediaPlayer mediaPlayer;
    private boolean isAudioPlaying = false;
    
    public AudioPlayer(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void startPlaying(@org.jetbrains.annotations.NotNull
    java.lang.String audioPath, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCompletion) {
    }
    
    public final void stopPlaying() {
    }
    
    public final boolean isPlaying() {
        return false;
    }
}