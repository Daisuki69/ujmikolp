package androidx.camera.extensions;

import androidx.camera.extensions.internal.VendorExtender;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements VendorExtenderFactory {
    @Override // androidx.camera.extensions.VendorExtenderFactory
    public final VendorExtender createVendorExtender(int i) {
        return ExtensionsInfo.getVendorExtender(i);
    }
}
