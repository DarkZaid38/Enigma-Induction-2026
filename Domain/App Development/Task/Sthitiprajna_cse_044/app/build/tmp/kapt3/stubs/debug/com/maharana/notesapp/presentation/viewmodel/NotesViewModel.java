package com.maharana.notesapp.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/maharana/notesapp/presentation/viewmodel/NotesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/maharana/notesapp/data/repository/NoteRepository;", "themeSettings", "Lcom/maharana/notesapp/utils/ThemeSettings;", "(Lcom/maharana/notesapp/data/repository/NoteRepository;Lcom/maharana/notesapp/utils/ThemeSettings;)V", "_event", "Lkotlinx/coroutines/channels/Channel;", "Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent;", "_notes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/maharana/notesapp/data/local/entity/Note;", "event", "Lkotlinx/coroutines/flow/Flow;", "getEvent", "()Lkotlinx/coroutines/flow/Flow;", "isDarkMode", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "notes", "getNotes", "onEvent", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class NotesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.maharana.notesapp.data.repository.NoteRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.maharana.notesapp.utils.ThemeSettings themeSettings = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.maharana.notesapp.data.local.entity.Note>> _notes = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.maharana.notesapp.data.local.entity.Note>> notes = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.Channel<com.maharana.notesapp.presentation.viewmodel.NotesEvent> _event = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.maharana.notesapp.presentation.viewmodel.NotesEvent> event = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isDarkMode = null;
    
    @javax.inject.Inject
    public NotesViewModel(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.repository.NoteRepository repository, @org.jetbrains.annotations.NotNull
    com.maharana.notesapp.utils.ThemeSettings themeSettings) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.maharana.notesapp.data.local.entity.Note>> getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.maharana.notesapp.presentation.viewmodel.NotesEvent> getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isDarkMode() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.presentation.viewmodel.NotesEvent event) {
    }
}