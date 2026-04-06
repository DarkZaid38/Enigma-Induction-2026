package com.maharana.notesapp.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/maharana/notesapp/data/local/Converters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "fromChecklistItemList", "", "Lcom/maharana/notesapp/data/local/entity/ChecklistItem;", "value", "", "fromStringList", "toChecklistItemList", "list", "toStringList", "app_debug"})
public final class Converters {
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> fromStringList(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String toStringList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.maharana.notesapp.data.local.entity.ChecklistItem> fromChecklistItemList(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String toChecklistItemList(@org.jetbrains.annotations.NotNull
    java.util.List<com.maharana.notesapp.data.local.entity.ChecklistItem> list) {
        return null;
    }
}