package io.flutter.plugins.imagepicker;

import io.flutter.plugins.imagepicker.ImagePickerDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements ImagePickerDelegate.OnPathReadyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImagePickerDelegate f17303b;

    public /* synthetic */ c(ImagePickerDelegate imagePickerDelegate, int i) {
        this.f17302a = i;
        this.f17303b = imagePickerDelegate;
    }

    @Override // io.flutter.plugins.imagepicker.ImagePickerDelegate.OnPathReadyListener
    public final void onPathReady(String str) {
        switch (this.f17302a) {
            case 0:
                this.f17303b.lambda$handleCaptureImageResult$7(str);
                break;
            default:
                this.f17303b.finishWithSuccess(str);
                break;
        }
    }
}
