package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient ByteString unknownFields;

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        private transient Buffer unknownFieldsBuffer;
        private transient ByteString unknownFieldsByteString = ByteString.EMPTY;
        private transient ProtoWriter unknownFieldsWriter;

        private final void prepareForNewUnknownFields() throws IOException {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new Buffer();
                Buffer buffer = this.unknownFieldsBuffer;
                j.d(buffer);
                ProtoWriter protoWriter = new ProtoWriter(buffer);
                this.unknownFieldsWriter = protoWriter;
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = ByteString.EMPTY;
            }
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) throws IOException {
            j.g(fieldEncoding, "fieldEncoding");
            prepareForNewUnknownFields();
            ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
            j.e(protoAdapterRawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            ProtoWriter protoWriter = this.unknownFieldsWriter;
            j.d(protoWriter);
            protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, i, obj);
            return this;
        }

        public final Builder<M, B> addUnknownFields(ByteString unknownFields) throws IOException {
            j.g(unknownFields, "unknownFields");
            if (unknownFields.size() > 0) {
                prepareForNewUnknownFields();
                ProtoWriter protoWriter = this.unknownFieldsWriter;
                j.d(protoWriter);
                protoWriter.writeBytes(unknownFields);
            }
            return this;
        }

        public abstract M build();

        public final ByteString buildUnknownFields() {
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                j.d(buffer);
                this.unknownFieldsByteString = buffer.readByteString();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() throws EOFException {
            this.unknownFieldsByteString = ByteString.EMPTY;
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                j.d(buffer);
                buffer.clear();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        public final Buffer getUnknownFieldsBuffer$wire_runtime() {
            return this.unknownFieldsBuffer;
        }

        public final ByteString getUnknownFieldsByteString$wire_runtime() {
            return this.unknownFieldsByteString;
        }

        public final ProtoWriter getUnknownFieldsWriter$wire_runtime() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(Buffer buffer) {
            this.unknownFieldsBuffer = buffer;
        }

        public final void setUnknownFieldsByteString$wire_runtime(ByteString byteString) {
            j.g(byteString, "<set-?>");
            this.unknownFieldsByteString = byteString;
        }

        public final void setUnknownFieldsWriter$wire_runtime(ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getSerialVersionUID$annotations() {
        }

        private Companion() {
        }
    }

    public Message(ProtoAdapter<M> adapter, ByteString unknownFields) {
        j.g(adapter, "adapter");
        j.g(unknownFields, "unknownFields");
        this.adapter = adapter;
        this.unknownFields = unknownFields;
    }

    public static /* synthetic */ void unknownFields$annotations() {
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(BufferedSink sink) throws IOException {
        j.g(sink, "sink");
        this.adapter.encode(sink, this);
    }

    public final ByteString encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    public final int getCachedSerializedSize$wire_runtime() {
        return this.cachedSerializedSize;
    }

    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i) {
        this.cachedSerializedSize = i;
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString == null ? ByteString.EMPTY : byteString;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().clearUnknownFields().build();
    }

    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream stream) throws IOException {
        j.g(stream, "stream");
        this.adapter.encode(stream, this);
    }
}
