package com.squareup.wire;

import X5.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.lang.reflect.Array;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okio.ByteString;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidMessage<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message<M, B> implements Parcelable {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> adapter) {
            j.g(adapter, "adapter");
            return new ProtoAdapterCreator(adapter);
        }

        private Companion() {
        }
    }

    public static final class ProtoAdapterCreator<M> implements Parcelable.Creator<M> {
        private final ProtoAdapter<M> adapter;

        public ProtoAdapterCreator(ProtoAdapter<M> adapter) {
            j.g(adapter, "adapter");
            this.adapter = adapter;
        }

        @Override // android.os.Parcelable.Creator
        public M createFromParcel(Parcel input) {
            j.g(input, "input");
            ProtoAdapter<M> protoAdapter = this.adapter;
            byte[] bArrCreateByteArray = input.createByteArray();
            j.f(bArrCreateByteArray, "createByteArray(...)");
            return protoAdapter.decode(bArrCreateByteArray);
        }

        @Override // android.os.Parcelable.Creator
        public M[] newArray(int i) {
            InterfaceC2488d type = this.adapter.getType();
            Object objNewInstance = Array.newInstance((Class<?>) (type != null ? f.o(type) : null), i);
            j.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<M of com.squareup.wire.AndroidMessage.ProtoAdapterCreator>");
            return (M[]) ((Object[]) objNewInstance);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMessage(ProtoAdapter<M> adapter, ByteString unknownFields) {
        super(adapter, unknownFields);
        j.g(adapter, "adapter");
        j.g(unknownFields, "unknownFields");
    }

    public static final <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
        return Companion.newCreator(protoAdapter);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeByteArray(encode());
    }
}
