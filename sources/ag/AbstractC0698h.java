package ag;

import android.content.Context;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ag.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0698h extends AbstractC0693c {
    public final short c;

    public AbstractC0698h(Context context) {
        super(context, 0);
        this.c = (short) 30;
    }

    @Override // ag.AbstractC0693c
    public final boolean e(Context context, String str) {
        return str == null || !str.equalsIgnoreCase(numX49.tnTj78("bue6")) || context.getApplicationInfo().targetSdkVersion >= this.c;
    }
}
