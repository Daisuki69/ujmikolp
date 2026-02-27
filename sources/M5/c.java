package M5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3083a;

    public c() {
        this.f3083a = new ArrayList();
    }

    @Override // M5.f
    public String d() {
        ArrayList arrayList = this.f3083a;
        StringBuilder sb2 = new StringBuilder((arrayList.size() * 3) + 36);
        sb2.append("has_phone_number = 1 AND data1 IN ( ");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                sb2.append("\"" + ((String) arrayList.get(i)) + "\" )");
            } else {
                sb2.append("\"" + ((String) arrayList.get(i)) + "\", ");
            }
        }
        return sb2.toString();
    }

    public c(ArrayList arrayList) {
        this.f3083a = new ArrayList(arrayList);
    }
}
