package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import dOYHB6.lBzGT9.pYp6Y3;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import io.flutter.plugins.imagepicker.Messages;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.w;
import pg.z;

/* JADX INFO: loaded from: classes4.dex */
public class ImagePickerDelegate implements w, z {

    @VisibleForTesting
    static final int REQUEST_CAMERA_IMAGE_PERMISSION = 2345;

    @VisibleForTesting
    static final int REQUEST_CAMERA_VIDEO_PERMISSION = 2355;

    @VisibleForTesting
    static final int REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY = 2342;

    @VisibleForTesting
    static final int REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY = 2347;

    @VisibleForTesting
    static final int REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY = 2346;

    @VisibleForTesting
    static final int REQUEST_CODE_CHOOSE_MULTI_VIDEO_FROM_GALLERY = 2348;

    @VisibleForTesting
    static final int REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY = 2352;

    @VisibleForTesting
    static final int REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA = 2343;

    @VisibleForTesting
    static final int REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA = 2353;

    @NonNull
    private final Activity activity;

    @NonNull
    private final ImagePickerCache cache;
    private CameraDevice cameraDevice;
    private final ExecutorService executor;

    @VisibleForTesting
    final String fileProviderName;
    private final FileUriResolver fileUriResolver;
    private final FileUtils fileUtils;

    @NonNull
    private final ImageResizer imageResizer;

    @Nullable
    private PendingCallState pendingCallState;
    private final Object pendingCallStateLock;
    private Uri pendingCameraMediaUri;
    private final PermissionManager permissionManager;

    /* JADX INFO: renamed from: io.flutter.plugins.imagepicker.ImagePickerDelegate$2, reason: invalid class name */
    public class AnonymousClass2 implements FileUriResolver {
        final /* synthetic */ Activity val$activity;

        public AnonymousClass2(Activity activity) {
            this.val$activity = activity;
        }

        @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.FileUriResolver
        public void getFullImagePath(Uri uri, final OnPathReadyListener onPathReadyListener) {
            MediaScannerConnection.scanFile(this.val$activity, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.d
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri2) {
                    onPathReadyListener.onPathReady(str);
                }
            });
        }

        @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.FileUriResolver
        public Uri resolveFileProviderUriForFile(String str, File file) {
            return FileProvider.getUriForFile(this.val$activity, str, file);
        }
    }

    public enum CameraDevice {
        REAR,
        FRONT
    }

    public interface FileUriResolver {
        void getFullImagePath(Uri uri, OnPathReadyListener onPathReadyListener);

        Uri resolveFileProviderUriForFile(String str, File file);
    }

    public class MediaPath {
        final String mimeType;
        final String path;

        public MediaPath(@NonNull String str, @Nullable String str2) {
            this.path = str;
            this.mimeType = str2;
        }

        @Nullable
        public String getMimeType() {
            return this.mimeType;
        }

        @NonNull
        public String getPath() {
            return this.path;
        }
    }

    public interface OnPathReadyListener {
        void onPathReady(String str);
    }

    public static class PendingCallState {

        @Nullable
        public final Messages.ImageSelectionOptions imageOptions;

        @NonNull
        public final Messages.Result<List<String>> result;

        @Nullable
        public final Messages.VideoSelectionOptions videoOptions;

        public PendingCallState(@Nullable Messages.ImageSelectionOptions imageSelectionOptions, @Nullable Messages.VideoSelectionOptions videoSelectionOptions, @NonNull Messages.Result<List<String>> result) {
            this.imageOptions = imageSelectionOptions;
            this.videoOptions = videoSelectionOptions;
            this.result = result;
        }
    }

    public interface PermissionManager {
        void askForPermission(String str, int i);

        boolean isPermissionGranted(String str);

        boolean needRequestCameraPermission();
    }

    public ImagePickerDelegate(@NonNull final Activity activity, @NonNull ImageResizer imageResizer, @NonNull ImagePickerCache imagePickerCache) {
        this(activity, imageResizer, null, null, null, imagePickerCache, new PermissionManager() { // from class: io.flutter.plugins.imagepicker.ImagePickerDelegate.1
            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.PermissionManager
            public void askForPermission(String str, int i) {
                pYp6Y3.requestPermissions(activity, new String[]{str}, i);
            }

            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.PermissionManager
            public boolean isPermissionGranted(String str) {
                return ContextCompat.checkSelfPermission(activity, str) == 0;
            }

            @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.PermissionManager
            public boolean needRequestCameraPermission() {
                return ImagePickerUtils.needRequestCameraPermission(activity);
            }
        }, new AnonymousClass2(activity), new FileUtils(), Executors.newSingleThreadExecutor());
    }

    private File createTemporaryWritableFile(String str) {
        String string = UUID.randomUUID().toString();
        File cacheDir = this.activity.getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(string, str, cacheDir);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private File createTemporaryWritableImageFile() {
        return createTemporaryWritableFile(".jpg");
    }

    private File createTemporaryWritableVideoFile() {
        return createTemporaryWritableFile(".mp4");
    }

    private void finishWithAlreadyActiveError(Messages.Result<List<String>> result) {
        result.error(new Messages.FlutterError("already_active", "Image picker is already active", null));
    }

    private void finishWithError(String str, String str2) {
        Messages.Result<List<String>> result;
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                result = pendingCallState != null ? pendingCallState.result : null;
                this.pendingCallState = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (result == null) {
            this.cache.saveResult(null, str, str2);
        } else {
            result.error(new Messages.FlutterError(str, str2, null));
        }
    }

    private void finishWithListSuccess(ArrayList<String> arrayList) {
        Messages.Result<List<String>> result;
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                result = pendingCallState != null ? pendingCallState.result : null;
                this.pendingCallState = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (result == null) {
            this.cache.saveResult(arrayList, null, null);
        } else {
            result.success(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishWithSuccess(@Nullable String str) {
        Messages.Result<List<String>> result;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                result = pendingCallState != null ? pendingCallState.result : null;
                this.pendingCallState = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (result != null) {
            result.success(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.cache.saveResult(arrayList, null, null);
        }
    }

    @Nullable
    private ArrayList<MediaPath> getPathsFromIntent(@NonNull Intent intent, boolean z4) {
        String pathFromUri;
        ArrayList<MediaPath> arrayList = new ArrayList<>();
        Uri data = intent.getData();
        if (data != null) {
            String pathFromUri2 = this.fileUtils.getPathFromUri(this.activity, data);
            if (pathFromUri2 == null) {
                return null;
            }
            arrayList.add(new MediaPath(pathFromUri2, null));
            return arrayList;
        }
        if (intent.getClipData() == null) {
            return null;
        }
        for (int i = 0; i < intent.getClipData().getItemCount(); i++) {
            Uri uri = intent.getClipData().getItemAt(i).getUri();
            if (uri == null || (pathFromUri = this.fileUtils.getPathFromUri(this.activity, uri)) == null) {
                return null;
            }
            arrayList.add(new MediaPath(pathFromUri, z4 ? this.activity.getContentResolver().getType(uri) : null));
        }
        return arrayList;
    }

    private String getResizedImagePath(String str, @NonNull Messages.ImageSelectionOptions imageSelectionOptions) {
        return this.imageResizer.resizeImageIfNeeded(str, imageSelectionOptions.getMaxWidth(), imageSelectionOptions.getMaxHeight(), imageSelectionOptions.getQuality().intValue());
    }

    private void grantUriPermissions(Intent intent, Uri uri) {
        PackageManager packageManager = this.activity.getPackageManager();
        Iterator<ResolveInfo> it = (Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)) : queryIntentActivitiesPreApi33(packageManager, intent)).iterator();
        while (it.hasNext()) {
            this.activity.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleCaptureImageResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$3(int i) {
        if (i != -1) {
            finishWithSuccess(null);
            return;
        }
        Uri uri = this.pendingCameraMediaUri;
        FileUriResolver fileUriResolver = this.fileUriResolver;
        if (uri == null) {
            uri = Uri.parse(this.cache.retrievePendingCameraMediaUriPath());
        }
        fileUriResolver.getFullImagePath(uri, new c(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleCaptureVideoResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$6(int i) {
        if (i != -1) {
            finishWithSuccess(null);
            return;
        }
        Uri uri = this.pendingCameraMediaUri;
        FileUriResolver fileUriResolver = this.fileUriResolver;
        if (uri == null) {
            uri = Uri.parse(this.cache.retrievePendingCameraMediaUriPath());
        }
        fileUriResolver.getFullImagePath(uri, new c(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseImageResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$0(int i, Intent intent) {
        if (i != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, false);
        if (pathsFromIntent == null) {
            finishWithError("no_valid_image_uri", "Cannot find the selected image.");
        } else {
            handleMediaResult(pathsFromIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseMediaResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$4(int i, Intent intent) {
        if (i != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, true);
        if (pathsFromIntent == null) {
            finishWithError("no_valid_media_uri", "Cannot find the selected media.");
        } else {
            handleMediaResult(pathsFromIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseMultiImageResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$1(int i, Intent intent) {
        if (i != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, false);
        if (pathsFromIntent == null) {
            finishWithError("missing_valid_image_uri", "Cannot find at least one of the selected images.");
        } else {
            handleMediaResult(pathsFromIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseMultiVideoResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$2(int i, Intent intent) {
        if (i != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, false);
        if (pathsFromIntent == null) {
            finishWithError("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
        } else {
            handleMediaResult(pathsFromIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleChooseVideoResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityResult$5(int i, Intent intent) {
        if (i != -1 || intent == null) {
            finishWithSuccess(null);
            return;
        }
        ArrayList<MediaPath> pathsFromIntent = getPathsFromIntent(intent, false);
        if (pathsFromIntent == null || pathsFromIntent.size() < 1) {
            finishWithError("no_valid_video_uri", "Cannot find the selected video.");
        } else {
            finishWithSuccess(pathsFromIntent.get(0).path);
        }
    }

    private void handleMediaResult(@NonNull ArrayList<MediaPath> arrayList) {
        Messages.ImageSelectionOptions imageSelectionOptions;
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                imageSelectionOptions = pendingCallState != null ? pendingCallState.imageOptions : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        int i = 0;
        if (imageSelectionOptions == null) {
            while (i < arrayList.size()) {
                arrayList2.add(arrayList.get(i).path);
                i++;
            }
            finishWithListSuccess(arrayList2);
            return;
        }
        while (i < arrayList.size()) {
            MediaPath mediaPath = arrayList.get(i);
            String resizedImagePath = mediaPath.path;
            String str = mediaPath.mimeType;
            if (str == null || !str.startsWith("video/")) {
                resizedImagePath = getResizedImagePath(mediaPath.path, imageSelectionOptions);
            }
            arrayList2.add(resizedImagePath);
            i++;
        }
        finishWithListSuccess(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleCaptureImageResult$7(String str) {
        handleImageResult(str, true);
    }

    private void launchMultiPickImageFromGalleryIntent(Boolean bool, int i) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new ActivityResultContracts.PickMultipleVisualMedia(i).createIntent((Context) this.activity, new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY);
    }

    private void launchMultiPickVideoFromGalleryIntent(Boolean bool, int i) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new ActivityResultContracts.PickMultipleVisualMedia(i).createIntent((Context) this.activity, new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE).build());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_MULTI_VIDEO_FROM_GALLERY);
    }

    private void launchPickImageFromGalleryIntent(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new ActivityResultContracts.PickVisualMedia().createIntent((Context) this.activity, new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY);
    }

    private void launchPickMediaFromGalleryIntent(Messages.GeneralOptions generalOptions) {
        Intent intentCreateIntent2;
        if (generalOptions.getUsePhotoPicker().booleanValue()) {
            intentCreateIntent2 = generalOptions.getAllowMultiple().booleanValue() ? new ActivityResultContracts.PickMultipleVisualMedia(ImagePickerUtils.getLimitFromOption(generalOptions)).createIntent((Context) this.activity, new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE).build()) : new ActivityResultContracts.PickVisualMedia().createIntent((Context) this.activity, new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE).build());
        } else {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            intent.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", generalOptions.getAllowMultiple());
            intentCreateIntent2 = intent;
        }
        this.activity.startActivityForResult(intentCreateIntent2, REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY);
    }

    private void launchPickVideoFromGalleryIntent(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new ActivityResultContracts.PickVisualMedia().createIntent((Context) this.activity, new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE).build());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
        }
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY);
    }

    private void launchTakeImageWithCameraIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.cameraDevice == CameraDevice.FRONT) {
            useFrontCamera(intent);
        }
        File fileCreateTemporaryWritableImageFile = createTemporaryWritableImageFile();
        this.pendingCameraMediaUri = Uri.parse("file:" + fileCreateTemporaryWritableImageFile.getAbsolutePath());
        Uri uriResolveFileProviderUriForFile = this.fileUriResolver.resolveFileProviderUriForFile(this.fileProviderName, fileCreateTemporaryWritableImageFile);
        intent.putExtra("output", uriResolveFileProviderUriForFile);
        grantUriPermissions(intent, uriResolveFileProviderUriForFile);
        try {
            try {
                this.activity.startActivityForResult(intent, REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA);
            } catch (ActivityNotFoundException unused) {
                fileCreateTemporaryWritableImageFile.delete();
                finishWithError("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e) {
            e.printStackTrace();
            finishWithError("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private void launchTakeVideoWithCameraIntent() {
        Messages.VideoSelectionOptions videoSelectionOptions;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                videoSelectionOptions = pendingCallState != null ? pendingCallState.videoOptions : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (videoSelectionOptions != null && videoSelectionOptions.getMaxDurationSeconds() != null) {
            intent.putExtra("android.intent.extra.durationLimit", videoSelectionOptions.getMaxDurationSeconds().intValue());
        }
        if (this.cameraDevice == CameraDevice.FRONT) {
            useFrontCamera(intent);
        }
        File fileCreateTemporaryWritableVideoFile = createTemporaryWritableVideoFile();
        this.pendingCameraMediaUri = Uri.parse("file:" + fileCreateTemporaryWritableVideoFile.getAbsolutePath());
        Uri uriResolveFileProviderUriForFile = this.fileUriResolver.resolveFileProviderUriForFile(this.fileProviderName, fileCreateTemporaryWritableVideoFile);
        intent.putExtra("output", uriResolveFileProviderUriForFile);
        grantUriPermissions(intent, uriResolveFileProviderUriForFile);
        try {
            try {
                this.activity.startActivityForResult(intent, REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA);
            } catch (ActivityNotFoundException unused) {
                fileCreateTemporaryWritableVideoFile.delete();
                finishWithError("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e) {
            e.printStackTrace();
            finishWithError("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private boolean needRequestCameraPermission() {
        PermissionManager permissionManager = this.permissionManager;
        if (permissionManager == null) {
            return false;
        }
        return permissionManager.needRequestCameraPermission();
    }

    private static List<ResolveInfo> queryIntentActivitiesPreApi33(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentActivities(intent, 65536);
    }

    private boolean setPendingOptionsAndResult(@Nullable Messages.ImageSelectionOptions imageSelectionOptions, @Nullable Messages.VideoSelectionOptions videoSelectionOptions, @NonNull Messages.Result<List<String>> result) {
        synchronized (this.pendingCallStateLock) {
            try {
                if (this.pendingCallState != null) {
                    return false;
                }
                this.pendingCallState = new PendingCallState(imageSelectionOptions, videoSelectionOptions, result);
                this.cache.clear();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void useFrontCamera(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    public void chooseImageFromGallery(@NonNull Messages.ImageSelectionOptions imageSelectionOptions, boolean z4, @NonNull Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(imageSelectionOptions, null, result)) {
            launchPickImageFromGalleryIntent(Boolean.valueOf(z4));
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseMediaFromGallery(@NonNull Messages.MediaSelectionOptions mediaSelectionOptions, @NonNull Messages.GeneralOptions generalOptions, @NonNull Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(mediaSelectionOptions.getImageSelectionOptions(), null, result)) {
            launchPickMediaFromGalleryIntent(generalOptions);
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseMultiImageFromGallery(@NonNull Messages.ImageSelectionOptions imageSelectionOptions, boolean z4, int i, @NonNull Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(imageSelectionOptions, null, result)) {
            launchMultiPickImageFromGalleryIntent(Boolean.valueOf(z4), i);
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseMultiVideoFromGallery(@NonNull Messages.VideoSelectionOptions videoSelectionOptions, boolean z4, int i, @NonNull Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(null, videoSelectionOptions, result)) {
            launchMultiPickVideoFromGalleryIntent(Boolean.valueOf(z4), i);
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void chooseVideoFromGallery(@NonNull Messages.VideoSelectionOptions videoSelectionOptions, boolean z4, @NonNull Messages.Result<List<String>> result) {
        if (setPendingOptionsAndResult(null, videoSelectionOptions, result)) {
            launchPickVideoFromGalleryIntent(Boolean.valueOf(z4));
        } else {
            finishWithAlreadyActiveError(result);
        }
    }

    public void handleImageResult(String str, boolean z4) {
        Messages.ImageSelectionOptions imageSelectionOptions;
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                imageSelectionOptions = pendingCallState != null ? pendingCallState.imageOptions : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (imageSelectionOptions == null) {
            finishWithSuccess(str);
            return;
        }
        String resizedImagePath = getResizedImagePath(str, imageSelectionOptions);
        if (resizedImagePath != null && !resizedImagePath.equals(str) && z4) {
            new File(str).delete();
        }
        finishWithSuccess(resizedImagePath);
    }

    @Override // pg.w
    public boolean onActivityResult(int i, final int i4, @Nullable final Intent intent) {
        Runnable runnable;
        if (i == REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY) {
            final int i6 = 0;
            runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ImagePickerDelegate f17298b;

                {
                    this.f17298b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            this.f17298b.lambda$onActivityResult$0(i4, intent);
                            break;
                        case 1:
                            this.f17298b.lambda$onActivityResult$1(i4, intent);
                            break;
                        case 2:
                            this.f17298b.lambda$onActivityResult$2(i4, intent);
                            break;
                        case 3:
                            this.f17298b.lambda$onActivityResult$4(i4, intent);
                            break;
                        default:
                            this.f17298b.lambda$onActivityResult$5(i4, intent);
                            break;
                    }
                }
            };
        } else if (i == REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA) {
            final int i10 = 0;
            runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ImagePickerDelegate f17301b;

                {
                    this.f17301b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.f17301b.lambda$onActivityResult$3(i4);
                            break;
                        default:
                            this.f17301b.lambda$onActivityResult$6(i4);
                            break;
                    }
                }
            };
        } else if (i == REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY) {
            final int i11 = 4;
            runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ImagePickerDelegate f17298b;

                {
                    this.f17298b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.f17298b.lambda$onActivityResult$0(i4, intent);
                            break;
                        case 1:
                            this.f17298b.lambda$onActivityResult$1(i4, intent);
                            break;
                        case 2:
                            this.f17298b.lambda$onActivityResult$2(i4, intent);
                            break;
                        case 3:
                            this.f17298b.lambda$onActivityResult$4(i4, intent);
                            break;
                        default:
                            this.f17298b.lambda$onActivityResult$5(i4, intent);
                            break;
                    }
                }
            };
        } else if (i != REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA) {
            switch (i) {
                case REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY /* 2346 */:
                    final int i12 = 1;
                    runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ImagePickerDelegate f17298b;

                        {
                            this.f17298b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    this.f17298b.lambda$onActivityResult$0(i4, intent);
                                    break;
                                case 1:
                                    this.f17298b.lambda$onActivityResult$1(i4, intent);
                                    break;
                                case 2:
                                    this.f17298b.lambda$onActivityResult$2(i4, intent);
                                    break;
                                case 3:
                                    this.f17298b.lambda$onActivityResult$4(i4, intent);
                                    break;
                                default:
                                    this.f17298b.lambda$onActivityResult$5(i4, intent);
                                    break;
                            }
                        }
                    };
                    break;
                case REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY /* 2347 */:
                    final int i13 = 3;
                    runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ImagePickerDelegate f17298b;

                        {
                            this.f17298b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    this.f17298b.lambda$onActivityResult$0(i4, intent);
                                    break;
                                case 1:
                                    this.f17298b.lambda$onActivityResult$1(i4, intent);
                                    break;
                                case 2:
                                    this.f17298b.lambda$onActivityResult$2(i4, intent);
                                    break;
                                case 3:
                                    this.f17298b.lambda$onActivityResult$4(i4, intent);
                                    break;
                                default:
                                    this.f17298b.lambda$onActivityResult$5(i4, intent);
                                    break;
                            }
                        }
                    };
                    break;
                case REQUEST_CODE_CHOOSE_MULTI_VIDEO_FROM_GALLERY /* 2348 */:
                    final int i14 = 2;
                    runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ImagePickerDelegate f17298b;

                        {
                            this.f17298b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    this.f17298b.lambda$onActivityResult$0(i4, intent);
                                    break;
                                case 1:
                                    this.f17298b.lambda$onActivityResult$1(i4, intent);
                                    break;
                                case 2:
                                    this.f17298b.lambda$onActivityResult$2(i4, intent);
                                    break;
                                case 3:
                                    this.f17298b.lambda$onActivityResult$4(i4, intent);
                                    break;
                                default:
                                    this.f17298b.lambda$onActivityResult$5(i4, intent);
                                    break;
                            }
                        }
                    };
                    break;
                default:
                    return false;
            }
        } else {
            final int i15 = 1;
            runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ImagePickerDelegate f17301b;

                {
                    this.f17301b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            this.f17301b.lambda$onActivityResult$3(i4);
                            break;
                        default:
                            this.f17301b.lambda$onActivityResult$6(i4);
                            break;
                    }
                }
            };
        }
        this.executor.execute(runnable);
        return true;
    }

    @Override // pg.z
    public boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        boolean z4 = iArr.length > 0 && iArr[0] == 0;
        if (i != REQUEST_CAMERA_IMAGE_PERMISSION) {
            if (i != REQUEST_CAMERA_VIDEO_PERMISSION) {
                return false;
            }
            if (z4) {
                launchTakeVideoWithCameraIntent();
            }
        } else if (z4) {
            launchTakeImageWithCameraIntent();
        }
        if (!z4 && (i == REQUEST_CAMERA_IMAGE_PERMISSION || i == REQUEST_CAMERA_VIDEO_PERMISSION)) {
            finishWithError("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    @Nullable
    public Messages.CacheRetrievalResult retrieveLostImage() {
        Map<String, Object> cacheMap = this.cache.getCacheMap();
        if (cacheMap.isEmpty()) {
            return null;
        }
        Messages.CacheRetrievalResult.Builder builder = new Messages.CacheRetrievalResult.Builder();
        Messages.CacheRetrievalType cacheRetrievalType = (Messages.CacheRetrievalType) cacheMap.get(SessionDescription.ATTR_TYPE);
        if (cacheRetrievalType != null) {
            builder.setType(cacheRetrievalType);
        }
        builder.setError((Messages.CacheRetrievalError) cacheMap.get(MediaRouteProviderProtocol.SERVICE_DATA_ERROR));
        ArrayList<String> arrayList = (ArrayList) cacheMap.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                Double d10 = (Double) cacheMap.get("maxWidth");
                Double d11 = (Double) cacheMap.get("maxHeight");
                Integer num = (Integer) cacheMap.get("imageQuality");
                arrayList2.add(this.imageResizer.resizeImageIfNeeded(str, d10, d11, num == null ? 100 : num.intValue()));
            }
            builder.setPaths(arrayList2);
        }
        this.cache.clear();
        return builder.build();
    }

    public void saveStateBeforeResult() {
        synchronized (this.pendingCallStateLock) {
            try {
                PendingCallState pendingCallState = this.pendingCallState;
                if (pendingCallState == null) {
                    return;
                }
                Messages.ImageSelectionOptions imageSelectionOptions = pendingCallState.imageOptions;
                this.cache.saveType(imageSelectionOptions != null ? ImagePickerCache.CacheType.IMAGE : ImagePickerCache.CacheType.VIDEO);
                if (imageSelectionOptions != null) {
                    this.cache.saveDimensionWithOutputOptions(imageSelectionOptions);
                }
                Uri uri = this.pendingCameraMediaUri;
                if (uri != null) {
                    this.cache.savePendingCameraMediaUriPath(uri);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setCameraDevice(CameraDevice cameraDevice) {
        this.cameraDevice = cameraDevice;
    }

    public void takeImageWithCamera(@NonNull Messages.ImageSelectionOptions imageSelectionOptions, @NonNull Messages.Result<List<String>> result) {
        if (!setPendingOptionsAndResult(imageSelectionOptions, null, result)) {
            finishWithAlreadyActiveError(result);
        } else if (!needRequestCameraPermission() || this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            launchTakeImageWithCameraIntent();
        } else {
            this.permissionManager.askForPermission("android.permission.CAMERA", REQUEST_CAMERA_IMAGE_PERMISSION);
        }
    }

    public void takeVideoWithCamera(@NonNull Messages.VideoSelectionOptions videoSelectionOptions, @NonNull Messages.Result<List<String>> result) {
        if (!setPendingOptionsAndResult(null, videoSelectionOptions, result)) {
            finishWithAlreadyActiveError(result);
        } else if (!needRequestCameraPermission() || this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            launchTakeVideoWithCameraIntent();
        } else {
            this.permissionManager.askForPermission("android.permission.CAMERA", REQUEST_CAMERA_VIDEO_PERMISSION);
        }
    }

    @VisibleForTesting
    public ImagePickerDelegate(@NonNull Activity activity, @NonNull ImageResizer imageResizer, @Nullable Messages.ImageSelectionOptions imageSelectionOptions, @Nullable Messages.VideoSelectionOptions videoSelectionOptions, @Nullable Messages.Result<List<String>> result, @NonNull ImagePickerCache imagePickerCache, PermissionManager permissionManager, FileUriResolver fileUriResolver, FileUtils fileUtils, ExecutorService executorService) {
        this.pendingCallStateLock = new Object();
        this.activity = activity;
        this.imageResizer = imageResizer;
        this.fileProviderName = activity.getPackageName() + ".flutter.image_provider";
        if (result != null) {
            this.pendingCallState = new PendingCallState(imageSelectionOptions, videoSelectionOptions, result);
        }
        this.permissionManager = permissionManager;
        this.fileUriResolver = fileUriResolver;
        this.fileUtils = fileUtils;
        this.cache = imagePickerCache;
        this.executor = executorService;
    }
}
