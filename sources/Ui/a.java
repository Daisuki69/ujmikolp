package Ui;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements k {
    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj instanceof a;
    }

    public final int hashCode() {
        return 17;
    }

    public final String toString() {
        return "in segment all";
    }
}
