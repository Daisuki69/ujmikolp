package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class Room {
    private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";
    public static final Room INSTANCE = new Room();
    public static final String LOG_TAG = "ROOM";
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, Class<T> klass, String str) {
        j.g(context, "context");
        j.g(klass, "klass");
        if (str == null || C2576A.H(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new RoomDatabase.Builder<>(context, klass, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T, C> T getGeneratedImplementation(Class<C> klass, String suffix) {
        String str;
        j.g(klass, "klass");
        j.g(suffix, "suffix");
        Package r02 = klass.getPackage();
        j.d(r02);
        String fullPackage = r02.getName();
        String canonicalName = klass.getCanonicalName();
        j.d(canonicalName);
        j.f(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            j.f(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = z.s(canonicalName, '.', '_').concat(suffix);
        try {
            if (fullPackage.length() == 0) {
                str = strConcat;
            } else {
                str = fullPackage + '.' + strConcat;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            j.e(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> klass) {
        j.g(context, "context");
        j.g(klass, "klass");
        return new RoomDatabase.Builder<>(context, klass, null);
    }
}
