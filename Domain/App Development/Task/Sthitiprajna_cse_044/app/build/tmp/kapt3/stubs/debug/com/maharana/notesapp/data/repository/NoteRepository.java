package com.maharana.notesapp.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u0010H&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u00102\u0006\u0010\u0013\u001a\u00020\rH&J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/maharana/notesapp/data/repository/NoteRepository;", "", "deleteChecklistItem", "", "item", "Lcom/maharana/notesapp/data/local/entity/ChecklistItem;", "(Lcom/maharana/notesapp/data/local/entity/ChecklistItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNote", "note", "Lcom/maharana/notesapp/data/local/entity/Note;", "(Lcom/maharana/notesapp/data/local/entity/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNoteById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "getChecklistItemsForNote", "noteId", "getNoteById", "insertChecklistItem", "insertNote", "updateChecklistItem", "updateNote", "app_debug"})
public abstract interface NoteRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maharana.notesapp.data.local.entity.Note>> getAllNotes();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNoteById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.maharana.notesapp.data.local.entity.Note> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertNote(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateNote(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteNoteById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maharana.notesapp.data.local.entity.ChecklistItem>> getChecklistItemsForNote(long noteId);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}