package Ti;

import Ui.f;
import defpackage.AbstractC1414e;
import io.split.android.client.dtos.ConditionType;
import io.split.android.client.dtos.Partition;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConditionType f5842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f5843b;
    public final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5844d;

    public a(ConditionType conditionType, f fVar, List list, String str) {
        this.f5842a = conditionType;
        this.f5843b = fVar;
        this.c = list;
        this.f5844d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        boolean zEquals = this.f5843b.equals(aVar.f5843b);
        if (!zEquals) {
            return false;
        }
        List list = this.c;
        int size = list.size();
        List list2 = aVar.c;
        if (size != list2.size()) {
            return zEquals;
        }
        for (int i = 0; i < list.size(); i++) {
            Partition partition = (Partition) list.get(i);
            Partition partition2 = (Partition) list2.get(i);
            zEquals &= partition.size == partition2.size && partition.treatment.equals(partition2.treatment);
        }
        return zEquals;
    }

    public final int hashCode() {
        int iHashCode = this.f5843b.hashCode() + 527;
        int iC = 17;
        for (Partition partition : this.c) {
            iC = AbstractC1414e.c(iC * 31, 31, partition.treatment) + partition.size;
        }
        return (iHashCode * 31) + iC;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5843b);
        sb2.append(" then split ");
        boolean z4 = true;
        for (Partition partition : this.c) {
            if (!z4) {
                sb2.append(',');
            }
            sb2.append(partition.size);
            sb2.append(':');
            sb2.append(partition.treatment);
            z4 = false;
        }
        return sb2.toString();
    }
}
