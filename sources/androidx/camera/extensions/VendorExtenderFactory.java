package androidx.camera.extensions;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.extensions.internal.VendorExtender;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
interface VendorExtenderFactory {
    @NonNull
    VendorExtender createVendorExtender(int i);
}
