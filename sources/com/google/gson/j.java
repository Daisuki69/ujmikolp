package com.google.gson;

import D8.C0193a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import defpackage.AbstractC1414e;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f10013n = i.f9873d;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f10014o = h.f9871a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f10015p = x.f10036a;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f10016q = x.f10037b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f10017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10018b;
    public final C0193a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f10019d;
    public final List e;
    public final Excluder f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10020g;
    public final boolean h;
    public final i i;
    public final List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f10021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f10022l;
    public final int m;

    /* JADX WARN: Illegal instructions before constructor call */
    public j() {
        Excluder excluder = Excluder.f9876d;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(excluder, f10014o, map, false, true, f10013n, 0, true, 1, list, list, list, f10015p, f10016q, list);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(o oVar, Class cls) {
        TypeToken typeToken = TypeToken.get(cls);
        if (oVar == null) {
            return null;
        }
        return c(new com.google.gson.internal.bind.d(oVar), typeToken);
    }

    public final Object c(j3.a aVar, TypeToken typeToken) {
        int i = aVar.f17701o;
        boolean z4 = true;
        int i4 = this.m;
        if (i4 != 0) {
            aVar.M(i4);
        } else if (i == 2) {
            aVar.f17701o = 1;
        }
        try {
            try {
                try {
                    try {
                        try {
                            aVar.peek();
                            z4 = false;
                            y yVarG = g(typeToken);
                            Object obj = yVarG.read(aVar);
                            Class clsM = com.google.gson.internal.e.m(typeToken.getRawType());
                            if (obj != null && !clsM.isInstance(obj)) {
                                throw new ClassCastException("Type adapter '" + yVarG + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + obj.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            return obj;
                        } catch (IOException e) {
                            throw new JsonSyntaxException(e);
                        }
                    } catch (IllegalStateException e7) {
                        throw new JsonSyntaxException(e7);
                    }
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
                }
            } catch (EOFException e11) {
                if (!z4) {
                    throw new JsonSyntaxException(e11);
                }
                aVar.M(i);
                return null;
            }
        } finally {
            aVar.M(i);
        }
    }

    public final Object d(Reader reader, TypeToken typeToken) {
        j3.a aVar = new j3.a(reader);
        int i = this.m;
        if (i == 0) {
            i = 2;
        }
        aVar.M(i);
        Object objC = c(aVar, typeToken);
        if (objC != null) {
            try {
                if (aVar.peek() != 10) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e7) {
                throw new JsonIOException(e7);
            }
        }
        return objC;
    }

    public final Object e(String str, Class cls) {
        TypeToken typeToken = TypeToken.get(cls);
        if (str == null) {
            return null;
        }
        return d(new StringReader(str), typeToken);
    }

    public final Object f(String str, Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        if (str == null) {
            return null;
        }
        return d(new StringReader(str), typeToken);
    }

    public final y g(TypeToken typeToken) {
        boolean z4;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f10018b;
        y yVar = (y) concurrentHashMap.get(typeToken);
        if (yVar != null) {
            return yVar;
        }
        ThreadLocal threadLocal = this.f10017a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z4 = true;
        } else {
            y yVar2 = (y) map.get(typeToken);
            if (yVar2 != null) {
                return yVar2;
            }
            z4 = false;
        }
        try {
            Gson$FutureTypeAdapter gson$FutureTypeAdapter = new Gson$FutureTypeAdapter();
            map.put(typeToken, gson$FutureTypeAdapter);
            Iterator it = this.e.iterator();
            y yVarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                yVarA = ((z) it.next()).a(this, typeToken);
                if (yVarA != null) {
                    if (gson$FutureTypeAdapter.f9869a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    gson$FutureTypeAdapter.f9869a = yVarA;
                    map.put(typeToken, yVarA);
                }
            }
            if (z4) {
                threadLocal.remove();
            }
            if (yVarA != null) {
                if (z4) {
                    concurrentHashMap.putAll(map);
                }
                return yVarA;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + typeToken);
        } catch (Throwable th2) {
            if (z4) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    public final y h(Class cls) {
        return g(TypeToken.get(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.y i(com.google.gson.z r7, com.google.gson.reflect.TypeToken r8) {
        /*
            r6 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = r6.f10019d
            r0.getClass()
            com.google.gson.z r1 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.c
            r2 = 1
            if (r7 != r1) goto L17
            goto L5b
        L17:
            java.lang.Class r1 = r8.getRawType()
            java.util.concurrent.ConcurrentHashMap r3 = r0.f9897b
            java.lang.Object r4 = r3.get(r1)
            com.google.gson.z r4 = (com.google.gson.z) r4
            if (r4 == 0) goto L28
            if (r4 != r7) goto L5c
            goto L5b
        L28:
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r4 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r4 = r1.getAnnotation(r4)
            com.google.gson.annotations.JsonAdapter r4 = (com.google.gson.annotations.JsonAdapter) r4
            if (r4 != 0) goto L33
            goto L5c
        L33:
            java.lang.Class r4 = r4.value()
            java.lang.Class<com.google.gson.z> r5 = com.google.gson.z.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L40
            goto L5c
        L40:
            D8.a r5 = r0.f9896a
            com.google.gson.reflect.TypeToken r4 = com.google.gson.reflect.TypeToken.get(r4)
            com.google.gson.internal.l r4 = r5.c(r4, r2)
            java.lang.Object r4 = r4.b()
            com.google.gson.z r4 = (com.google.gson.z) r4
            java.lang.Object r1 = r3.putIfAbsent(r1, r4)
            com.google.gson.z r1 = (com.google.gson.z) r1
            if (r1 == 0) goto L59
            r4 = r1
        L59:
            if (r4 != r7) goto L5c
        L5b:
            r7 = r0
        L5c:
            java.util.List r0 = r6.e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L63:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r0.next()
            com.google.gson.z r3 = (com.google.gson.z) r3
            if (r1 != 0) goto L75
            if (r3 != r7) goto L63
            r1 = r2
            goto L63
        L75:
            com.google.gson.y r3 = r3.a(r6, r8)
            if (r3 == 0) goto L63
            return r3
        L7c:
            if (r1 != 0) goto L83
            com.google.gson.y r7 = r6.g(r8)
            return r7
        L83:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.j.i(com.google.gson.z, com.google.gson.reflect.TypeToken):com.google.gson.y");
    }

    public final j3.b j(Writer writer) {
        j3.b bVar = new j3.b(writer);
        bVar.t(this.i);
        bVar.i = this.h;
        int i = this.m;
        if (i == 0) {
            i = 2;
        }
        bVar.w(i);
        bVar.f17708k = this.f10020g;
        return bVar;
    }

    public final String k(Object obj) {
        if (obj != null) {
            return l(obj, obj.getClass());
        }
        StringWriter stringWriter = new StringWriter();
        try {
            m(j(AbstractC1414e.u(stringWriter) ? stringWriter : new com.google.gson.internal.n(stringWriter)));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final String l(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            n(obj, type, j(AbstractC1414e.u(stringWriter) ? stringWriter : new com.google.gson.internal.n(stringWriter)));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final void m(j3.b bVar) {
        p pVar = p.f10033a;
        int i = bVar.h;
        boolean z4 = bVar.i;
        boolean z5 = bVar.f17708k;
        bVar.i = this.h;
        bVar.f17708k = this.f10020g;
        int i4 = this.m;
        if (i4 != 0) {
            bVar.w(i4);
        } else if (i == 2) {
            bVar.h = 1;
        }
        try {
            try {
                try {
                    com.google.gson.internal.bind.i.f9975z.write(bVar, pVar);
                    bVar.w(i);
                    bVar.i = z4;
                    bVar.f17708k = z5;
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e7.getMessage(), e7);
            }
        } catch (Throwable th2) {
            bVar.w(i);
            bVar.i = z4;
            bVar.f17708k = z5;
            throw th2;
        }
    }

    public final void n(Object obj, Type type, j3.b bVar) {
        y yVarG = g(TypeToken.get(type));
        int i = bVar.h;
        int i4 = this.m;
        if (i4 != 0) {
            bVar.w(i4);
        } else if (i == 2) {
            bVar.h = 1;
        }
        boolean z4 = bVar.i;
        boolean z5 = bVar.f17708k;
        bVar.i = this.h;
        bVar.f17708k = this.f10020g;
        try {
            try {
                yVarG.write(bVar, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e7.getMessage(), e7);
            }
        } finally {
            bVar.w(i);
            bVar.i = z4;
            bVar.f17708k = z5;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f10020g + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public j(Excluder excluder, h hVar, Map map, boolean z4, boolean z5, i iVar, int i, boolean z8, int i4, List list, List list2, List list3, x xVar, x xVar2, List list4) {
        final y yVar;
        z zVarA;
        this.f10017a = new ThreadLocal();
        this.f10018b = new ConcurrentHashMap();
        this.f = excluder;
        C0193a c0193a = new C0193a(map, z8, list4);
        this.c = c0193a;
        this.f10020g = z4;
        this.h = z5;
        this.i = iVar;
        this.m = i;
        this.j = list;
        this.f10021k = list2;
        this.f10022l = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.i.f9955A);
        arrayList.add(ObjectTypeAdapter.a(xVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.i.f9965p);
        arrayList.add(com.google.gson.internal.bind.i.f9960g);
        arrayList.add(com.google.gson.internal.bind.i.f9959d);
        arrayList.add(com.google.gson.internal.bind.i.e);
        arrayList.add(com.google.gson.internal.bind.i.f);
        if (i4 == 1) {
            yVar = com.google.gson.internal.bind.i.f9961k;
        } else {
            yVar = new y() { // from class: com.google.gson.Gson$3
                @Override // com.google.gson.y
                public final Object read(j3.a aVar) {
                    if (aVar.peek() != 9) {
                        return Long.valueOf(aVar.D());
                    }
                    aVar.G();
                    return null;
                }

                @Override // com.google.gson.y
                public final void write(j3.b bVar, Object obj) throws IOException {
                    Number number = (Number) obj;
                    if (number == null) {
                        bVar.r();
                    } else {
                        bVar.E(number.toString());
                    }
                }
            };
        }
        arrayList.add(com.google.gson.internal.bind.i.c(Long.TYPE, Long.class, yVar));
        arrayList.add(com.google.gson.internal.bind.i.c(Double.TYPE, Double.class, new Gson$1()));
        arrayList.add(com.google.gson.internal.bind.i.c(Float.TYPE, Float.class, new Gson$2()));
        if (xVar2 == x.f10037b) {
            zVarA = NumberTypeAdapter.f9903b;
        } else {
            zVarA = NumberTypeAdapter.a(xVar2);
        }
        arrayList.add(zVarA);
        arrayList.add(com.google.gson.internal.bind.i.h);
        arrayList.add(com.google.gson.internal.bind.i.i);
        arrayList.add(com.google.gson.internal.bind.i.b(AtomicLong.class, new y() { // from class: com.google.gson.Gson$4
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                return new AtomicLong(((Number) yVar.read(aVar)).longValue());
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) {
                yVar.write(bVar, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.nullSafe()));
        arrayList.add(com.google.gson.internal.bind.i.b(AtomicLongArray.class, new y() { // from class: com.google.gson.Gson$5
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                aVar.b();
                while (aVar.t()) {
                    arrayList2.add(Long.valueOf(((Number) yVar.read(aVar)).longValue()));
                }
                aVar.i();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i6 = 0; i6 < size; i6++) {
                    atomicLongArray.set(i6, ((Long) arrayList2.get(i6)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.c();
                int length = atomicLongArray.length();
                for (int i6 = 0; i6 < length; i6++) {
                    yVar.write(bVar, Long.valueOf(atomicLongArray.get(i6)));
                }
                bVar.i();
            }
        }.nullSafe()));
        arrayList.add(com.google.gson.internal.bind.i.j);
        arrayList.add(com.google.gson.internal.bind.i.f9962l);
        arrayList.add(com.google.gson.internal.bind.i.f9966q);
        arrayList.add(com.google.gson.internal.bind.i.f9967r);
        arrayList.add(com.google.gson.internal.bind.i.b(BigDecimal.class, com.google.gson.internal.bind.i.m));
        arrayList.add(com.google.gson.internal.bind.i.b(BigInteger.class, com.google.gson.internal.bind.i.f9963n));
        arrayList.add(com.google.gson.internal.bind.i.b(com.google.gson.internal.g.class, com.google.gson.internal.bind.i.f9964o));
        arrayList.add(com.google.gson.internal.bind.i.f9968s);
        arrayList.add(com.google.gson.internal.bind.i.f9969t);
        arrayList.add(com.google.gson.internal.bind.i.f9971v);
        arrayList.add(com.google.gson.internal.bind.i.f9972w);
        arrayList.add(com.google.gson.internal.bind.i.f9974y);
        arrayList.add(com.google.gson.internal.bind.i.f9970u);
        arrayList.add(com.google.gson.internal.bind.i.f9958b);
        arrayList.add(DefaultDateTypeAdapter.c);
        arrayList.add(com.google.gson.internal.bind.i.f9973x);
        if (com.google.gson.internal.sql.b.f10010a) {
            arrayList.add(com.google.gson.internal.sql.b.e);
            arrayList.add(com.google.gson.internal.sql.b.f10012d);
            arrayList.add(com.google.gson.internal.sql.b.f);
        }
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(com.google.gson.internal.bind.i.f9957a);
        arrayList.add(new CollectionTypeAdapterFactory(c0193a));
        arrayList.add(new MapTypeAdapterFactory(c0193a));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(c0193a);
        this.f10019d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.i.f9956B);
        arrayList.add(new ReflectiveTypeAdapterFactory(c0193a, hVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.e = Collections.unmodifiableList(arrayList);
    }
}
