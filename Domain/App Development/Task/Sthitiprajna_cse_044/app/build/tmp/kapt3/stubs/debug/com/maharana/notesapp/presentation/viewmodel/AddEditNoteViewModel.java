package com.maharana.notesapp.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0007J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\nJ\u0006\u0010-\u001a\u00020)J\u000e\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u001eJ\u0010\u00100\u001a\u00020)2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007J\u000e\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\fJ\u000e\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020\u0007J\u0014\u00105\u001a\u00020)2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u000e\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\u0007J\u0006\u00108\u001a\u00020)J\u000e\u00109\u001a\u00020)2\u0006\u0010,\u001a\u00020\nR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0016\u00a8\u0006:"}, d2 = {"Lcom/maharana/notesapp/presentation/viewmodel/AddEditNoteViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/maharana/notesapp/data/repository/NoteRepository;", "(Lcom/maharana/notesapp/data/repository/NoteRepository;)V", "_audioPath", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_checklistItems", "", "Lcom/maharana/notesapp/data/local/entity/ChecklistItem;", "_color", "", "_content", "_event", "Lkotlinx/coroutines/channels/Channel;", "Lcom/maharana/notesapp/presentation/viewmodel/AddEditNoteEvent;", "_images", "_title", "audioPath", "Lkotlinx/coroutines/flow/StateFlow;", "getAudioPath", "()Lkotlinx/coroutines/flow/StateFlow;", "checklistItems", "getChecklistItems", "color", "getColor", "content", "getContent", "currentNoteId", "", "Ljava/lang/Long;", "event", "Lkotlinx/coroutines/flow/Flow;", "getEvent", "()Lkotlinx/coroutines/flow/Flow;", "images", "getImages", "title", "getTitle", "addChecklistItem", "", "text", "deleteChecklistItem", "item", "deleteNote", "loadNote", "noteId", "onAudioPathChange", "onColorChange", "newColor", "onContentChange", "newContent", "onImagesChange", "onTitleChange", "newTitle", "saveNote", "updateChecklistItem", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AddEditNoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.maharana.notesapp.data.repository.NoteRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _title = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _content = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> content = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _color = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> color = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _audioPath = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> audioPath = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> _images = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> images = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.maharana.notesapp.data.local.entity.ChecklistItem>> _checklistItems = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.maharana.notesapp.data.local.entity.ChecklistItem>> checklistItems = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.Channel<com.maharana.notesapp.presentation.viewmodel.AddEditNoteEvent> _event = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.maharana.notesapp.presentation.viewmodel.AddEditNoteEvent> event = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long currentNoteId;
    
    @javax.inject.Inject
    public AddEditNoteViewModel(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.repository.NoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getAudioPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.maharana.notesapp.data.local.entity.ChecklistItem>> getChecklistItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.maharana.notesapp.presentation.viewmodel.AddEditNoteEvent> getEvent() {
        return null;
    }
    
    public final void onTitleChange(@org.jetbrains.annotations.NotNull
    java.lang.String newTitle) {
    }
    
    public final void onContentChange(@org.jetbrains.annotations.NotNull
    java.lang.String newContent) {
    }
    
    public final void onColorChange(int newColor) {
    }
    
    public final void onAudioPathChange(@org.jetbrains.annotations.Nullable
    java.lang.String audioPath) {
    }
    
    public final void onImagesChange(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> images) {
    }
    
    public final void addChecklistItem(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    public final void updateChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item) {
    }
    
    public final void deleteChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item) {
    }
    
    public final void saveNote() {
    }
    
    public final void loadNote(long noteId) {
    }
    
    public final void deleteNote() {
    }
}