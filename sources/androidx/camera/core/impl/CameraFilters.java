package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CameraFilters {
    public static final CameraFilter ANY;
    public static final CameraFilter NONE;

    static {
        final int i = 0;
        ANY = new CameraFilter() { // from class: androidx.camera.core.impl.f
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                switch (i) {
                    case 0:
                        return CameraFilters.lambda$static$0(list);
                    default:
                        return CameraFilters.lambda$static$1(list);
                }
            }

            @Override // androidx.camera.core.CameraFilter
            public final /* synthetic */ Identifier getIdentifier() {
                switch (i) {
                }
                return androidx.camera.core.e.a(this);
            }
        };
        final int i4 = 1;
        NONE = new CameraFilter() { // from class: androidx.camera.core.impl.f
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                switch (i4) {
                    case 0:
                        return CameraFilters.lambda$static$0(list);
                    default:
                        return CameraFilters.lambda$static$1(list);
                }
            }

            @Override // androidx.camera.core.CameraFilter
            public final /* synthetic */ Identifier getIdentifier() {
                switch (i4) {
                }
                return androidx.camera.core.e.a(this);
            }
        };
    }

    private CameraFilters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$0(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$1(List list) {
        return Collections.EMPTY_LIST;
    }
}
