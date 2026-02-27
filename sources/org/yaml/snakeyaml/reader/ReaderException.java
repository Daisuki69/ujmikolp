package org.yaml.snakeyaml.reader;

import We.s;
import org.yaml.snakeyaml.error.YAMLException;

/* JADX INFO: loaded from: classes5.dex */
public class ReaderException extends YAMLException {
    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbW = s.w("unacceptable code point '", new String(Character.toChars(0)), "' (0x");
        sbW.append(Integer.toHexString(0).toUpperCase());
        sbW.append(") ");
        sbW.append(getMessage());
        sbW.append("\nin \"");
        sbW.append((String) null);
        sbW.append("\", position ");
        sbW.append(0);
        return sbW.toString();
    }
}
