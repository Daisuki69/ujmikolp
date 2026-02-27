package com.squareup.wire;

import com.squareup.wire.Message;
import defpackage.AbstractC1414e;
import java.io.IOException;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class AnyMessage extends Message {
    public static final ProtoAdapter<AnyMessage> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private final String typeUrl;
    private final ByteString value;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnyMessage pack(Message<?, ?> message) {
            j.g(message, "message");
            String typeUrl = message.adapter().getTypeUrl();
            if (typeUrl != null) {
                return new AnyMessage(typeUrl, message.encodeByteString());
            }
            throw new IllegalStateException(("recompile " + z.a(message.getClass()) + " to use it with AnyMessage").toString());
        }

        private Companion() {
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final C1790e c1790eA = z.a(AnyMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AnyMessage>(fieldEncoding, c1790eA, syntax) { // from class: com.squareup.wire.AnyMessage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AnyMessage value) {
                j.g(value, "value");
                return ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getValue()) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTypeUrl());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage redact(AnyMessage value) {
                j.g(value, "value");
                return new AnyMessage("square.github.io/wire/redacted", ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage decode(ProtoReader reader) throws IOException {
                j.g(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return new AnyMessage(strDecode, byteStringDecode);
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AnyMessage value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getTypeUrl());
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AnyMessage value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getValue());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getTypeUrl());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage decode(ProtoReader32 reader) throws IOException {
                j.g(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                int iBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return new AnyMessage(strDecode, byteStringDecode);
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    }
                }
            }
        };
    }

    public /* synthetic */ AnyMessage(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ AnyMessage copy$default(AnyMessage anyMessage, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anyMessage.typeUrl;
        }
        if ((i & 2) != 0) {
            byteString = anyMessage.value;
        }
        return anyMessage.copy(str, byteString);
    }

    public final AnyMessage copy(String typeUrl, ByteString value) {
        j.g(typeUrl, "typeUrl");
        j.g(value, "value");
        return new AnyMessage(typeUrl, value);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnyMessage)) {
            return false;
        }
        AnyMessage anyMessage = (AnyMessage) obj;
        return j.b(this.typeUrl, anyMessage.typeUrl) && j.b(this.value, anyMessage.value);
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final ByteString getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.value.hashCode() + AbstractC1414e.c(i * 37, 37, this.typeUrl);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m183newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "Any{type_url=" + this.typeUrl + ", value=" + this.value + '}';
    }

    public final <T> T unpack(ProtoAdapter<T> adapter) {
        j.g(adapter, "adapter");
        if (j.b(this.typeUrl, adapter.getTypeUrl())) {
            return adapter.decode(this.value);
        }
        throw new IllegalStateException(("type mismatch: " + this.typeUrl + " != " + adapter.getTypeUrl()).toString());
    }

    public final <T> T unpackOrNull(ProtoAdapter<T> adapter) {
        j.g(adapter, "adapter");
        if (j.b(this.typeUrl, adapter.getTypeUrl())) {
            return adapter.decode(this.value);
        }
        return null;
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m183newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnyMessage(String typeUrl, ByteString value) {
        super(ADAPTER, ByteString.EMPTY);
        j.g(typeUrl, "typeUrl");
        j.g(value, "value");
        this.typeUrl = typeUrl;
        this.value = value;
    }
}
