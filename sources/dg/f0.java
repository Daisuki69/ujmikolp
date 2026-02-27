package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Wifi;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5PX"));
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Wifi(strDecode, strDecode2, strDecode3, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                strDecode3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Wifi wifi = (Wifi) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5PG"));
        kotlin.jvm.internal.j.g(wifi, numX49.tnTj78("bd5P3"));
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, wifi.getMacAddress());
        protoAdapter.encodeWithTag(protoWriter, 2, wifi.getIpAddress());
        protoAdapter.encodeWithTag(protoWriter, 3, wifi.getSsid());
        protoWriter.writeBytes(wifi.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Wifi wifi = (Wifi) obj;
        kotlin.jvm.internal.j.g(wifi, numX49.tnTj78("bd5P7"));
        int size = wifi.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, wifi.getSsid()) + protoAdapter.encodedSizeWithTag(2, wifi.getIpAddress()) + protoAdapter.encodedSizeWithTag(1, wifi.getMacAddress()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Wifi wifi = (Wifi) obj;
        kotlin.jvm.internal.j.g(wifi, numX49.tnTj78("bd5PA"));
        return Wifi.copy$default(wifi, null, null, null, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Wifi wifi = (Wifi) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5Py"));
        kotlin.jvm.internal.j.g(wifi, numX49.tnTj78("bd5Pv"));
        reverseProtoWriter.writeBytes(wifi.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, wifi.getSsid());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, wifi.getIpAddress());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, wifi.getMacAddress());
    }
}
