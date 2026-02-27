package com.google.gson.internal.bind;

import D8.C0193a;
import Kh.I;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0193a f9899a;

    public final class Adapter<K, V> extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f9900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f9901b;
        public final l c;

        public Adapter(y yVar, y yVar2, l lVar) {
            this.f9900a = yVar;
            this.f9901b = yVar2;
            this.c = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.y
        public final Object read(j3.a aVar) throws IOException {
            int iPeek = aVar.peek();
            if (iPeek == 9) {
                aVar.G();
                return null;
            }
            Map map = (Map) this.c.b();
            if (iPeek == 1) {
                aVar.b();
                while (aVar.t()) {
                    aVar.b();
                    Object obj = ((TypeAdapterRuntimeTypeWrapper) this.f9900a).f9924b.read(aVar);
                    if (map.put(obj, ((TypeAdapterRuntimeTypeWrapper) this.f9901b).f9924b.read(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + obj);
                    }
                    aVar.i();
                }
                aVar.i();
                return map;
            }
            aVar.c();
            while (aVar.t()) {
                I.f2692b.getClass();
                if (aVar instanceof d) {
                    d dVar = (d) aVar;
                    dVar.T(5);
                    Map.Entry entry = (Map.Entry) ((Iterator) dVar.X()).next();
                    dVar.Z(entry.getValue());
                    dVar.Z(new r((String) entry.getKey()));
                } else {
                    int iG = aVar.f17697g;
                    if (iG == 0) {
                        iG = aVar.g();
                    }
                    if (iG == 13) {
                        aVar.f17697g = 9;
                    } else if (iG == 12) {
                        aVar.f17697g = 8;
                    } else {
                        if (iG != 14) {
                            throw aVar.S("a name");
                        }
                        aVar.f17697g = 10;
                    }
                }
                Object obj2 = ((TypeAdapterRuntimeTypeWrapper) this.f9900a).f9924b.read(aVar);
                if (map.put(obj2, ((TypeAdapterRuntimeTypeWrapper) this.f9901b).f9924b.read(aVar)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + obj2);
                }
            }
            aVar.k();
            return map;
        }

        @Override // com.google.gson.y
        public final void write(j3.b bVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                bVar.r();
                return;
            }
            MapTypeAdapterFactory.this.getClass();
            y yVar = this.f9901b;
            bVar.f();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                bVar.m(String.valueOf(entry.getKey()));
                yVar.write(bVar, entry.getValue());
            }
            bVar.k();
        }
    }

    public MapTypeAdapterFactory(C0193a c0193a) {
        this.f9899a = c0193a;
    }

    @Override // com.google.gson.z
    public final y a(j jVar, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(rawType)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            com.google.gson.internal.e.b(Map.class.isAssignableFrom(rawType));
            Type typeK = com.google.gson.internal.e.k(type, rawType, com.google.gson.internal.e.g(type, rawType, Map.class), new HashMap());
            actualTypeArguments = typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type type3 = actualTypeArguments[1];
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(jVar, (type2 == Boolean.TYPE || type2 == Boolean.class) ? i.c : jVar.g(TypeToken.get(type2)), type2), new TypeAdapterRuntimeTypeWrapper(jVar, jVar.g(TypeToken.get(type3)), type3), this.f9899a.c(typeToken, false));
    }
}
