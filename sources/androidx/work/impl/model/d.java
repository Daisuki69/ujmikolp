package androidx.work.impl.model;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static void a(WorkTagDao workTagDao, String id, Set tags) {
        j.g(id, "id");
        j.g(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            workTagDao.insert(new WorkTag((String) it.next(), id));
        }
    }
}
