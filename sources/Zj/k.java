package zj;

import cj.AbstractC1117c;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends AbstractC1117c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f21484a;

    public k(n nVar) {
        this.f21484a = nVar;
    }

    @Override // cj.AbstractC1115a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.f21484a.f21488a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // cj.AbstractC1115a
    public final int getSize() {
        return this.f21484a.f21488a.groupCount() + 1;
    }

    @Override // cj.AbstractC1117c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // cj.AbstractC1117c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
