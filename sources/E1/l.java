package E1;

/* JADX INFO: loaded from: classes2.dex */
public final class l {
    public static l a() {
        byte b8 = (byte) (((byte) 1) | 2);
        if (b8 == 3) {
            return new l();
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((b8 & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        ((l) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return -721381028;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=0, allowAssetPackDeletion=false}";
    }
}
