package com.maharana.notesapp.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/maharana/notesapp/utils/AudioRecorder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioFile", "Ljava/io/File;", "isRecording", "", "mediaRecorder", "Landroid/media/MediaRecorder;", "cancelRecording", "", "startRecording", "", "stopRecording", "app_debug"})
public final class AudioRecorder {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable
    private android.media.MediaRecorder mediaRecorder;
    @org.jetbrains.annotations.Nullable
    private java.io.File audioFile;
    private boolean isRecording = false;
    
    public AudioRecorder(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String startRecording() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String stopRecording() {
        return null;
    }
    
    public final void cancelRecording() {
    }
    
    public final boolean isRecording() {
        return false;
    }
}