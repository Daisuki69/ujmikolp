package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class K0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new WifiNetwork(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag != 3) {
                reader.readUnknownField(iNextTag);
            } else {
                strDecode3 = ProtoAdapter.STRING.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        WifiNetwork value = (WifiNetwork) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.getSsid());
        protoAdapter.encodeWithTag(writer, 2, value.getIp_address());
        protoAdapter.encodeWithTag(writer, 3, value.getMac_address());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WifiNetwork value = (WifiNetwork) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, value.getMac_address()) + protoAdapter.encodedSizeWithTag(2, value.getIp_address()) + protoAdapter.encodedSizeWithTag(1, value.getSsid()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WifiNetwork value = (WifiNetwork) obj;
        j.g(value, "value");
        return WifiNetwork.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        WifiNetwork value = (WifiNetwork) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 3, value.getMac_address());
        protoAdapter.encodeWithTag(writer, 2, value.getIp_address());
        protoAdapter.encodeWithTag(writer, 1, value.getSsid());
    }
}
