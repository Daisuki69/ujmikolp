package com.google.gson.internal.bind;

import D8.C0193a;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0193a f9887a;

    public static final class Adapter<E> extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f9888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f9889b;

        public Adapter(y yVar, l lVar) {
            this.f9888a = yVar;
            this.f9889b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.y
        public final Object read(j3.a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            Collection collection = (Collection) this.f9889b.b();
            aVar.b();
            while (aVar.t()) {
                collection.add(((TypeAdapterRuntimeTypeWrapper) this.f9888a).f9924b.read(aVar));
            }
            aVar.i();
            return collection;
        }

        @Override // com.google.gson.y
        public final void write(j3.b bVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.r();
                return;
            }
            bVar.c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f9888a.write(bVar, it.next());
            }
            bVar.i();
        }
    }

    public CollectionTypeAdapterFactory(C0193a c0193a) {
        this.f9887a = c0193a;
    }

    @Override // com.google.gson.z
    public final y a(j jVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.e.b(Collection.class.isAssignableFrom(rawType));
        Type typeK = com.google.gson.internal.e.k(type, rawType, com.google.gson.internal.e.g(type, rawType, Collection.class), new HashMap());
        Class cls = typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments()[0] : Object.class;
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(jVar, jVar.g(TypeToken.get(cls)), cls), this.f9887a.c(typeToken, false));
    }
}
