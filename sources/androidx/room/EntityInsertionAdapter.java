package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import cj.C1132s;
import cj.r;
import dj.C1406d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase database) {
        super(database);
        j.g(database, "database");
    }

    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t5);

    public final void insert(T t5) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t5);
            supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long insertAndReturnId(T t5) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t5);
            return supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> entities) {
        j.g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i = 0;
            for (T t5 : entities) {
                int i4 = i + 1;
                if (i < 0) {
                    C1132s.k();
                    throw null;
                }
                bind(supportSQLiteStatementAcquire, t5);
                jArr[i] = supportSQLiteStatementAcquire.executeInsert();
                i = i4;
            }
            release(supportSQLiteStatementAcquire);
            return jArr;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        j.g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(supportSQLiteStatementAcquire, it.next());
                lArr[i] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] entities) {
        j.g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            C1406d c1406dB = r.b();
            for (T t5 : entities) {
                bind(supportSQLiteStatementAcquire, t5);
                c1406dB.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            C1406d c1406dA = r.a(c1406dB);
            release(supportSQLiteStatementAcquire);
            return c1406dA;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final void insert(T[] entities) {
        j.g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            for (T t5 : entities) {
                bind(supportSQLiteStatementAcquire, t5);
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] entities) {
        j.g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        Rj.f fVarF = D.f(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                bind(supportSQLiteStatementAcquire, fVarF.next());
                lArr[i] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> entities) {
        j.g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            C1406d c1406dB = r.b();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                c1406dB.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            C1406d c1406dA = r.a(c1406dB);
            release(supportSQLiteStatementAcquire);
            return c1406dA;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final long[] insertAndReturnIdsArray(T[] entities) {
        j.g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i = 0;
            int i4 = 0;
            while (i < length) {
                int i6 = i4 + 1;
                bind(supportSQLiteStatementAcquire, entities[i]);
                jArr[i4] = supportSQLiteStatementAcquire.executeInsert();
                i++;
                i4 = i6;
            }
            return jArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final void insert(Iterable<? extends T> entities) {
        j.g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }
}
