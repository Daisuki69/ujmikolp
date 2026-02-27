package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzej extends zzei {
    public zzej(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.clearcut.zzei
    public final void zzv() {
        if (!isImmutable()) {
            for (int i = 0; i < zzdr(); i++) {
                Map.Entry entryZzak = zzak(i);
                if (((zzca) entryZzak.getKey()).zzaw()) {
                    entryZzak.setValue(Collections.unmodifiableList((List) entryZzak.getValue()));
                }
            }
            for (Map.Entry entry : zzds()) {
                if (((zzca) entry.getKey()).zzaw()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzv();
    }
}
