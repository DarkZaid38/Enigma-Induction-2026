package com.maharana.notesapp.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00160\u0015H\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u001d\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/maharana/notesapp/data/repository/NoteRepositoryImpl;", "Lcom/maharana/notesapp/data/repository/NoteRepository;", "noteDao", "Lcom/maharana/notesapp/data/local/dao/NoteDao;", "checklistItemDao", "Lcom/maharana/notesapp/data/local/dao/ChecklistItemDao;", "(Lcom/maharana/notesapp/data/local/dao/NoteDao;Lcom/maharana/notesapp/data/local/dao/ChecklistItemDao;)V", "deleteChecklistItem", "", "item", "Lcom/maharana/notesapp/data/local/entity/ChecklistItem;", "(Lcom/maharana/notesapp/data/local/entity/ChecklistItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNote", "note", "Lcom/maharana/notesapp/data/local/entity/Note;", "(Lcom/maharana/notesapp/data/local/entity/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNoteById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "getChecklistItemsForNote", "noteId", "getNoteById", "insertChecklistItem", "insertNote", "updateChecklistItem", "updateNote", "app_debug"})
public final class NoteRepositoryImpl implements com.maharana.notesapp.data.repository.NoteRepository {
    @org.jetbrains.annotations.NotNull
    private final com.maharana.notesapp.data.local.dao.NoteDao noteDao = null;
    @org.jetbrains.annotations.NotNull
    private final com.maharana.notesapp.data.local.dao.ChecklistItemDao checklistItemDao = null;
    
    @javax.inject.Inject
    public NoteRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.dao.NoteDao noteDao, @org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.dao.ChecklistItemDao checklistItemDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.maharana.notesapp.data.local.entity.Note>> getAllNotes() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getNoteById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.maharana.notesapp.data.local.entity.Note> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertNote(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateNote(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteNoteById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.maharana.notesapp.data.local.entity.ChecklistItem>> getChecklistItemsForNote(long noteId) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}