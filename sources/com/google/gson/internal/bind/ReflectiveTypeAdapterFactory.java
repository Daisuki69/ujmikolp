package com.google.gson.internal.bind;

import D8.C0193a;
import We.s;
import androidx.camera.video.AudioStats;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0193a f9909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.gson.h f9910b;
    public final Excluder c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f9911d;
    public final List e;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1, reason: invalid class name */
    class AnonymousClass1 extends y {
        @Override // com.google.gson.y
        public final Object read(j3.a aVar) {
            aVar.Q();
            return null;
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }

        @Override // com.google.gson.y
        public final void write(j3.b bVar, Object obj) throws IOException {
            bVar.r();
        }
    }

    public static abstract class Adapter<T, A> extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f9912a;

        public Adapter(h hVar) {
            this.f9912a = hVar;
        }

        public abstract Object a();

        public abstract Object b(Object obj);

        public abstract void c(Object obj, j3.a aVar, g gVar);

        @Override // com.google.gson.y
        public final Object read(j3.a aVar) {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            Object objA = a();
            Map map = this.f9912a.f9953a;
            try {
                aVar.c();
                while (aVar.t()) {
                    g gVar = (g) map.get(aVar.E());
                    if (gVar == null) {
                        aVar.Q();
                    } else {
                        c(objA, aVar, gVar);
                    }
                }
                aVar.k();
                return b(objA);
            } catch (IllegalAccessException e) {
                qk.i iVar = i3.c.f17096a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            } catch (IllegalStateException e7) {
                throw new JsonSyntaxException(e7);
            }
        }

        @Override // com.google.gson.y
        public final void write(j3.b bVar, Object obj) throws IOException {
            if (obj == null) {
                bVar.r();
                return;
            }
            bVar.f();
            try {
                Iterator it = this.f9912a.f9954b.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).a(bVar, obj);
                }
                bVar.k();
            } catch (IllegalAccessException e) {
                qk.i iVar = i3.c.f17096a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f9913b;

        public FieldReflectionAdapter(l lVar, h hVar) {
            super(hVar);
            this.f9913b = lVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object a() {
            return this.f9913b.b();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object b(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void c(Object obj, j3.a aVar, g gVar) throws IllegalAccessException {
            Object obj2 = gVar.f.read(aVar);
            if (obj2 == null && gVar.f9952g) {
                return;
            }
            Field field = gVar.f9950b;
            if (gVar.h) {
                throw new JsonIOException(AbstractC1414e.h("Cannot set value of 'static final' ", i3.c.d(field, false)));
            }
            field.set(obj, obj2);
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        public static final HashMap e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Constructor f9914b;
        public final Object[] c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap f9915d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            e = map;
        }

        public RecordAdapter(Class cls, h hVar) {
            super(hVar);
            this.f9915d = new HashMap();
            qk.i iVar = i3.c.f17096a;
            Constructor constructorV = iVar.v(cls);
            this.f9914b = constructorV;
            i3.c.f(constructorV);
            String[] strArrY = iVar.y(cls);
            for (int i = 0; i < strArrY.length; i++) {
                this.f9915d.put(strArrY[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.f9914b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i4 = 0; i4 < parameterTypes.length; i4++) {
                this.c[i4] = e.get(parameterTypes[i4]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object a() {
            return (Object[]) this.c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object b(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.f9914b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e7) {
                qk.i iVar = i3.c.f17096a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
            } catch (IllegalArgumentException e10) {
                e = e10;
                throw new RuntimeException("Failed to invoke constructor '" + i3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + i3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + i3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void c(Object obj, j3.a aVar, g gVar) {
            Object[] objArr = (Object[]) obj;
            HashMap map = this.f9915d;
            String str = gVar.c;
            Integer num = (Integer) map.get(str);
            if (num == null) {
                throw new IllegalStateException("Could not find the index in the constructor '" + i3.c.b(this.f9914b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            }
            int iIntValue = num.intValue();
            Object obj2 = gVar.f.read(aVar);
            if (obj2 != null || !gVar.f9952g) {
                objArr[iIntValue] = obj2;
            } else {
                StringBuilder sbW = s.w("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                sbW.append(aVar.getPath());
                throw new JsonParseException(sbW.toString());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(C0193a c0193a, com.google.gson.h hVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f9909a = c0193a;
        this.f9910b = hVar;
        this.c = excluder;
        this.f9911d = jsonAdapterAnnotationTypeAdapterFactory;
        this.e = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + i3.c.c(field) + " and " + i3.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.google.gson.z
    public final y a(j jVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        qk.i iVar = i3.c.f17096a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new AnonymousClass1();
        }
        com.google.gson.internal.e.f(this.e);
        return i3.c.f17096a.C(rawType) ? new RecordAdapter(rawType, c(jVar, typeToken, rawType, true)) : new FieldReflectionAdapter(this.f9909a.c(typeToken, true), c(jVar, typeToken, rawType, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.internal.bind.h c(com.google.gson.j r30, com.google.gson.reflect.TypeToken r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(com.google.gson.j, com.google.gson.reflect.TypeToken, java.lang.Class, boolean):com.google.gson.internal.bind.h");
    }

    public final boolean d(Field field, boolean z4) {
        boolean z5;
        InterfaceC1497a interfaceC1497a;
        Excluder excluder = this.c;
        excluder.getClass();
        if ((field.getModifiers() & TsExtractor.TS_STREAM_TYPE_DTS_HD) == 0 && !field.isSynthetic() && ((!excluder.f9877a || ((interfaceC1497a = (InterfaceC1497a) field.getAnnotation(InterfaceC1497a.class)) != null && (!z4 ? !interfaceC1497a.deserialize() : !interfaceC1497a.serialize()))) && !excluder.c(field.getType(), z4))) {
            List list = z4 ? excluder.f9878b : excluder.c;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC1331a.n(it);
                }
            }
            z5 = false;
        } else {
            z5 = true;
        }
        return !z5;
    }
}
