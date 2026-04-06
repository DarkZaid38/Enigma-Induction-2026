package com.maharana.notesapp.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent;", "", "()V", "DeleteNote", "RestoreNote", "ToggleTheme", "Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent$DeleteNote;", "Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent$RestoreNote;", "Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent$ToggleTheme;", "app_debug"})
public abstract class NotesEvent {
    
    private NotesEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent$DeleteNote;", "Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent;", "note", "Lcom/maharana/notesapp/data/local/entity/Note;", "(Lcom/maharana/notesapp/data/local/entity/Note;)V", "getNote", "()Lcom/maharana/notesapp/data/local/entity/Note;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DeleteNote extends com.maharana.notesapp.presentation.viewmodel.NotesEvent {
        @org.jetbrains.annotations.NotNull
        private final com.maharana.notesapp.data.local.entity.Note note = null;
        
        public DeleteNote(@org.jetbrains.annotations.NotNull
        com.maharana.notesapp.data.local.entity.Note note) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.maharana.notesapp.data.local.entity.Note getNote() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.maharana.notesapp.data.local.entity.Note component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.maharana.notesapp.presentation.viewmodel.NotesEvent.DeleteNote copy(@org.jetbrains.annotations.NotNull
        com.maharana.notesapp.data.local.entity.Note note) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent$RestoreNote;", "Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent;", "note", "Lcom/maharana/notesapp/data/local/entity/Note;", "(Lcom/maharana/notesapp/data/local/entity/Note;)V", "getNote", "()Lcom/maharana/notesapp/data/local/entity/Note;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class RestoreNote extends com.maharana.notesapp.presentation.viewmodel.NotesEvent {
        @org.jetbrains.annotations.NotNull
        private final com.maharana.notesapp.data.local.entity.Note note = null;
        
        public RestoreNote(@org.jetbrains.annotations.NotNull
        com.maharana.notesapp.data.local.entity.Note note) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.maharana.notesapp.data.local.entity.Note getNote() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.maharana.notesapp.data.local.entity.Note component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.maharana.notesapp.presentation.viewmodel.NotesEvent.RestoreNote copy(@org.jetbrains.annotations.NotNull
        com.maharana.notesapp.data.local.entity.Note note) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent$ToggleTheme;", "Lcom/maharana/notesapp/presentation/viewmodel/NotesEvent;", "()V", "app_debug"})
    public static final class ToggleTheme extends com.maharana.notesapp.presentation.viewmodel.NotesEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.maharana.notesapp.presentation.viewmodel.NotesEvent.ToggleTheme INSTANCE = null;
        
        private ToggleTheme() {
        }
    }
}