package defpackage;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0616a extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EnumC0842b.f8261b.getClass();
        if (i == 0) {
            return EnumC0842b.f8262d;
        }
        if (i == 1) {
            return EnumC0842b.e;
        }
        if (i == 2) {
            return EnumC0842b.f;
        }
        if (i == 3) {
            return EnumC0842b.f8263g;
        }
        if (i == 4) {
            return EnumC0842b.h;
        }
        if (i != 5) {
            return null;
        }
        return EnumC0842b.i;
    }
}
