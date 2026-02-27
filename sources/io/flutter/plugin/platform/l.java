package io.flutter.plugin.platform;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    private final pg.q createArgsCodec;

    public l(pg.q qVar) {
        this.createArgsCodec = qVar;
    }

    public abstract k create(Context context, int i, Object obj);

    @Nullable
    public final pg.q getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
