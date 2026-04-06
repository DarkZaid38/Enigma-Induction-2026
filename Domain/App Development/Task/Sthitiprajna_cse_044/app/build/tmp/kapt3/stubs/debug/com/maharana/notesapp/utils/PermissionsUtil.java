package com.maharana.notesapp.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\rJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\rJ\u0011\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\u0002\u0010\u0011J$\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00130\r\u00a8\u0006\u0014"}, d2 = {"Lcom/maharana/notesapp/utils/PermissionsUtil;", "", "()V", "checkAudioPermission", "", "context", "Landroid/content/Context;", "checkCameraPermission", "checkPermission", "permission", "", "checkStoragePermission", "getAudioPermissionContract", "Landroidx/activity/result/contract/ActivityResultContract;", "getCameraPermissionContract", "getRequiredPermissions", "", "()[Ljava/lang/String;", "getStoragePermissionContract", "", "app_debug"})
public final class PermissionsUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.maharana.notesapp.utils.PermissionsUtil INSTANCE = null;
    
    private PermissionsUtil() {
        super();
    }
    
    public final boolean checkPermission(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String permission) {
        return false;
    }
    
    public final boolean checkAudioPermission(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final boolean checkCameraPermission(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final boolean checkStoragePermission(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.lang.Boolean> getAudioPermissionContract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.lang.Boolean> getCameraPermissionContract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.Map<java.lang.String, java.lang.Boolean>> getStoragePermissionContract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getRequiredPermissions() {
        return null;
    }
}