package com.maharana.notesapp.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f2\u0006\u0010\b\u001a\u00020\tH\'J\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/maharana/notesapp/data/local/dao/ChecklistItemDao;", "", "deleteChecklistItem", "", "item", "Lcom/maharana/notesapp/data/local/entity/ChecklistItem;", "(Lcom/maharana/notesapp/data/local/entity/ChecklistItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteChecklistItemsForNote", "noteId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChecklistItemsForNote", "Lkotlinx/coroutines/flow/Flow;", "", "insertChecklistItem", "insertChecklistItems", "items", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateChecklistItem", "app_debug"})
@androidx.room.Dao
public abstract interface ChecklistItemDao {
    
    @androidx.room.Query(value = "SELECT * FROM checklist_items WHERE noteId = :noteId ORDER BY `order` ASC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maharana.notesapp.data.local.entity.ChecklistItem>> getChecklistItemsForNote(long noteId);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertChecklistItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.maharana.notesapp.data.local.entity.ChecklistItem> items, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteChecklistItem(@org.jetbrains.annotations.NotNull
    com.maharana.notesapp.data.local.entity.ChecklistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM checklist_items WHERE noteId = :noteId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteChecklistItemsForNote(long noteId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}