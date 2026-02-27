package androidx.navigation;

import We.s;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.AnyRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2579a;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NavType<T> {
    private final boolean isNullableAllowed;
    private final String name = "nav_type";
    public static final Companion Companion = new Companion(null);
    public static final NavType<Integer> IntType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$IntType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_INT;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return (Integer) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            int i;
            j.g(value, "value");
            if (z.w(value, 2, "0x", false)) {
                String strSubstring = value.substring(2);
                j.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                C2579a.a(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(value);
            }
            return Integer.valueOf(i);
        }

        public void put(Bundle bundle, String key, int i) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putInt(key, i);
        }
    };
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "reference";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @AnyRes
        public Integer get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return (Integer) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            int i;
            j.g(value, "value");
            if (z.w(value, 2, "0x", false)) {
                String strSubstring = value.substring(2);
                j.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                C2579a.a(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(value);
            }
            return Integer.valueOf(i);
        }

        public void put(Bundle bundle, String key, @AnyRes int i) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putInt(key, i);
        }
    };
    public static final NavType<int[]> IntArrayType = new NavType<int[]>() { // from class: androidx.navigation.NavType$Companion$IntArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer[]";
        }

        @Override // androidx.navigation.NavType
        public int[] get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public int[] parseValue(String value) {
            j.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, int[] iArr) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putIntArray(key, iArr);
        }
    };
    public static final NavType<Long> LongType = new NavType<Long>() { // from class: androidx.navigation.NavType$Companion$LongType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Long l6) {
            put(bundle, str, l6.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return (Long) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String value) {
            String strSubstring;
            long j;
            j.g(value, "value");
            if (z.n(value, 2, i.f16189u, false)) {
                strSubstring = value.substring(0, value.length() - 1);
                j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = value;
            }
            if (z.w(value, 2, "0x", false)) {
                String strSubstring2 = strSubstring.substring(2);
                j.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                C2579a.a(16);
                j = Long.parseLong(strSubstring2, 16);
            } else {
                j = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j);
        }

        public void put(Bundle bundle, String key, long j) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putLong(key, j);
        }
    };
    public static final NavType<long[]> LongArrayType = new NavType<long[]>() { // from class: androidx.navigation.NavType$Companion$LongArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long[]";
        }

        @Override // androidx.navigation.NavType
        public long[] get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public long[] parseValue(String value) {
            j.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, long[] jArr) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putLongArray(key, jArr);
        }
    };
    public static final NavType<Float> FloatType = new NavType<Float>() { // from class: androidx.navigation.NavType$Companion$FloatType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_FLOAT;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Float f) {
            put(bundle, str, f.floatValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return (Float) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String value) {
            j.g(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void put(Bundle bundle, String key, float f) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putFloat(key, f);
        }
    };
    public static final NavType<float[]> FloatArrayType = new NavType<float[]>() { // from class: androidx.navigation.NavType$Companion$FloatArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "float[]";
        }

        @Override // androidx.navigation.NavType
        public float[] get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public float[] parseValue(String value) {
            j.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, float[] fArr) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putFloatArray(key, fArr);
        }
    };
    public static final NavType<Boolean> BoolType = new NavType<Boolean>() { // from class: androidx.navigation.NavType$Companion$BoolType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_BOOLEAN;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String value) {
            boolean z4;
            j.g(value, "value");
            if (value.equals("true")) {
                z4 = true;
            } else {
                if (!value.equals("false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
            put(bundle, str, bool.booleanValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (Boolean) bundle.get(key);
        }

        public void put(Bundle bundle, String key, boolean z4) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putBoolean(key, z4);
        }
    };
    public static final NavType<boolean[]> BoolArrayType = new NavType<boolean[]>() { // from class: androidx.navigation.NavType$Companion$BoolArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean[]";
        }

        @Override // androidx.navigation.NavType
        public boolean[] get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public boolean[] parseValue(String value) {
            j.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, boolean[] zArr) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putBooleanArray(key, zArr);
        }
    };
    public static final NavType<String> StringType = new NavType<String>() { // from class: androidx.navigation.NavType$Companion$StringType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_STRING;
        }

        @Override // androidx.navigation.NavType
        public String parseValue(String value) {
            j.g(value, "value");
            return value;
        }

        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String str) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putString(key, str);
        }
    };
    public static final NavType<String[]> StringArrayType = new NavType<String[]>() { // from class: androidx.navigation.NavType$Companion$StringArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "string[]";
        }

        @Override // androidx.navigation.NavType
        public String[] get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value) {
            j.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String[] strArr) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            bundle.putStringArray(key, strArr);
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public NavType<?> fromArgType(String str, String str2) {
            NavType<Integer> navType = NavType.IntType;
            if (j.b(navType.getName(), str)) {
                return navType;
            }
            NavType navType2 = NavType.IntArrayType;
            if (j.b(navType2.getName(), str)) {
                return navType2;
            }
            NavType<Long> navType3 = NavType.LongType;
            if (j.b(navType3.getName(), str)) {
                return navType3;
            }
            NavType navType4 = NavType.LongArrayType;
            if (j.b(navType4.getName(), str)) {
                return navType4;
            }
            NavType<Boolean> navType5 = NavType.BoolType;
            if (j.b(navType5.getName(), str)) {
                return navType5;
            }
            NavType navType6 = NavType.BoolArrayType;
            if (j.b(navType6.getName(), str)) {
                return navType6;
            }
            NavType<String> navType7 = NavType.StringType;
            if (!j.b(navType7.getName(), str)) {
                NavType navType8 = NavType.StringArrayType;
                if (j.b(navType8.getName(), str)) {
                    return navType8;
                }
                NavType<Float> navType9 = NavType.FloatType;
                if (j.b(navType9.getName(), str)) {
                    return navType9;
                }
                NavType navType10 = NavType.FloatArrayType;
                if (j.b(navType10.getName(), str)) {
                    return navType10;
                }
                NavType<Integer> navType11 = NavType.ReferenceType;
                if (j.b(navType11.getName(), str)) {
                    return navType11;
                }
                if (str != null && str.length() != 0) {
                    try {
                        String strConcat = (!z.w(str, 2, ".", false) || str2 == null) ? str : str2.concat(str);
                        if (z.n(str, 2, "[]", false)) {
                            strConcat = strConcat.substring(0, strConcat.length() - 2);
                            j.f(strConcat, "this as java.lang.String…ing(startIndex, endIndex)");
                            Class<?> cls = Class.forName(strConcat);
                            if (Parcelable.class.isAssignableFrom(cls)) {
                                return new ParcelableArrayType(cls);
                            }
                            if (Serializable.class.isAssignableFrom(cls)) {
                                return new SerializableArrayType(cls);
                            }
                        } else {
                            Class<?> cls2 = Class.forName(strConcat);
                            if (Parcelable.class.isAssignableFrom(cls2)) {
                                return new ParcelableType(cls2);
                            }
                            if (Enum.class.isAssignableFrom(cls2)) {
                                return new EnumType(cls2);
                            }
                            if (Serializable.class.isAssignableFrom(cls2)) {
                                return new SerializableType(cls2);
                            }
                        }
                        throw new IllegalArgumentException(strConcat + " is not Serializable or Parcelable.");
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return navType7;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavType<Object> inferFromValue(String value) {
            j.g(value, "value");
            try {
                try {
                    try {
                        try {
                            NavType<Integer> navType = NavType.IntType;
                            navType.parseValue(value);
                            return navType;
                        } catch (IllegalArgumentException unused) {
                            NavType<Float> navType2 = NavType.FloatType;
                            navType2.parseValue(value);
                            return navType2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        return NavType.StringType;
                    }
                } catch (IllegalArgumentException unused3) {
                    NavType<Long> navType3 = NavType.LongType;
                    navType3.parseValue(value);
                    return navType3;
                }
            } catch (IllegalArgumentException unused4) {
                NavType<Boolean> navType4 = NavType.BoolType;
                navType4.parseValue(value);
                return navType4;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavType<Object> inferFromValueType(Object obj) {
            if (obj instanceof Integer) {
                return NavType.IntType;
            }
            if (obj instanceof int[]) {
                return NavType.IntArrayType;
            }
            if (obj instanceof Long) {
                return NavType.LongType;
            }
            if (obj instanceof long[]) {
                return NavType.LongArrayType;
            }
            if (obj instanceof Float) {
                return NavType.FloatType;
            }
            if (obj instanceof float[]) {
                return NavType.FloatArrayType;
            }
            if (obj instanceof Boolean) {
                return NavType.BoolType;
            }
            if (obj instanceof boolean[]) {
                return NavType.BoolArrayType;
            }
            if ((obj instanceof String) || obj == null) {
                return NavType.StringType;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                return NavType.StringArrayType;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                j.d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    if (componentType2 != null) {
                        return new ParcelableArrayType(componentType2);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                j.d(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    if (componentType4 != null) {
                        return new SerializableArrayType(componentType4);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                }
            }
            if (obj instanceof Parcelable) {
                return new ParcelableType(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new EnumType(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new SerializableType(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        private Companion() {
        }
    }

    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(Class<D> type) {
            super(true);
            j.g(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                this.arrayType = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ParcelableArrayType.class.equals(obj.getClass())) {
                return false;
            }
            return j.b(this.arrayType, ((ParcelableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.arrayType.getName();
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String value) {
            j.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D[] dArr) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            this.arrayType.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }
    }

    public static final class ParcelableType<D> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(Class<D> type) {
            super(true);
            j.g(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ParcelableType.class.equals(obj.getClass())) {
                return false;
            }
            return j.b(this.type, ((ParcelableType) obj).type);
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.type.getName();
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            j.g(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D d10) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            this.type.cast(d10);
            if (d10 == 0 || (d10 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d10);
            }
        }
    }

    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(Class<D> type) {
            super(true);
            j.g(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                this.arrayType = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !SerializableArrayType.class.equals(obj.getClass())) {
                return false;
            }
            return j.b(this.arrayType, ((SerializableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.arrayType.getName();
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String value) {
            j.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D[] dArr) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            this.arrayType.cast(dArr);
            bundle.putSerializable(key, dArr);
        }
    }

    public static class SerializableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(Class<D> type) {
            super(true);
            j.g(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SerializableType) {
                return j.b(this.type, ((SerializableType) obj).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.type.getName();
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String key) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            j.g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D value) {
            j.g(bundle, "bundle");
            j.g(key, "key");
            j.g(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z4, Class<D> type) {
            super(z4);
            j.g(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }

    public NavType(boolean z4) {
        this.isNullableAllowed = z4;
    }

    public static NavType<?> fromArgType(String str, String str2) {
        return Companion.fromArgType(str, str2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final NavType<Object> inferFromValue(String str) {
        return Companion.inferFromValue(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final NavType<Object> inferFromValueType(Object obj) {
        return Companion.inferFromValueType(obj);
    }

    public abstract T get(Bundle bundle, String str);

    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(Bundle bundle, String key, String value) {
        j.g(bundle, "bundle");
        j.g(key, "key");
        j.g(value, "value");
        T value2 = parseValue(value);
        put(bundle, key, value2);
        return value2;
    }

    public abstract T parseValue(String str);

    public abstract void put(Bundle bundle, String str, T t5);

    public String toString() {
        return getName();
    }

    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(Class<D> type) {
            super(false, type);
            j.g(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public String getName() {
            return this.type.getName();
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public D parseValue(String value) {
            D d10;
            j.g(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            j.f(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i];
                if (z.o(d10.name(), value, true)) {
                    break;
                }
                i++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            StringBuilder sbW = s.w("Enum value ", value, " not found for type ");
            sbW.append(this.type.getName());
            sbW.append('.');
            throw new IllegalArgumentException(sbW.toString());
        }
    }
}
