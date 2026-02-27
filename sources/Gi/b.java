package Gi;

import Ff.f;
import Kh.I;
import defpackage.AbstractC1414e;
import io.split.android.client.storage.db.GeneralInfoEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import java.util.Objects;
import ki.InterfaceC1782c;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1998a = "r7khp5rhirj501lqn5t6q1chpnc1cis703jd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitRoomDatabase f1999b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f2000d;

    public b(SplitRoomDatabase splitRoomDatabase, d dVar) {
        Objects.requireNonNull(splitRoomDatabase);
        this.f1999b = splitRoomDatabase;
        this.c = true;
        Objects.requireNonNull(dVar);
        this.f2000d = dVar;
    }

    @Override // ki.InterfaceC1782c
    public final f execute() {
        Object obj;
        boolean z4 = this.c;
        SplitRoomDatabase splitRoomDatabase = this.f1999b;
        try {
            System.currentTimeMillis();
            GeneralInfoEntity byName = splitRoomDatabase.generalInfoDao().getByName(GeneralInfoEntity.DATABASE_ENCRYPTION_MODE);
            int i = 2;
            if (byName != null) {
                String stringValue = byName.getStringValue();
                for (int i4 : AbstractC2217b.d(2)) {
                    if (AbstractC1414e.a(i4).equalsIgnoreCase(stringValue)) {
                        i = i4;
                    }
                }
                throw new IllegalArgumentException(AbstractC1414e.h("Invalid string value for SplitEncryptionLevel: ", stringValue));
            }
            if (z4) {
                i = 1;
            }
            int i6 = z4 ? 1 : 2;
            String str = this.f1998a;
            d dVar = this.f2000d;
            I i10 = new I(4);
            boolean z5 = i != i6;
            Object aVar = null;
            if (z5) {
                if (i == 1) {
                    try {
                        aVar = new a(str);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar = new M2.b(4);
                }
                Objects.requireNonNull(dVar);
                obj = aVar;
                aVar = splitRoomDatabase;
            } else {
                obj = null;
                dVar = null;
                i10 = null;
            }
            if (z5) {
                i10.getClass();
                new Ci.a(2, aVar, obj, dVar).execute();
            }
            splitRoomDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.DATABASE_ENCRYPTION_MODE, AbstractC1414e.a(i6)));
            return f.k(10);
        } catch (Exception e) {
            Ri.a.g("Error while migrating encryption: " + e.getMessage());
            return f.d(10);
        }
    }
}
