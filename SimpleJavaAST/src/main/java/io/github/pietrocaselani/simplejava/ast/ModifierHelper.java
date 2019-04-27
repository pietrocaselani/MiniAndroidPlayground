package io.github.pietrocaselani.simplejava.ast;

import java.lang.reflect.Modifier;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class ModifierHelper {
    public static final int PACKAGE = 0;
    public static final int PUBLIC = Modifier.PUBLIC;
    public static final int PRIVATE = Modifier.PRIVATE;
    public static final int PROTECTED = Modifier.PROTECTED;
    public static final int STATIC = Modifier.STATIC;
    public static final int FINAL = Modifier.FINAL;
    public static final int SYNCHRONIZED = Modifier.SYNCHRONIZED;
    public static final int VOLATILE = Modifier.VOLATILE;
    public static final int TRANSIENT = Modifier.TRANSIENT;
    public static final int NATIVE = Modifier.NATIVE;
    public static final int ABSTRACT = Modifier.ABSTRACT;
    public static final int STRICTFP = Modifier.STRICT;

    private ModifierHelper() {
        throw new AssertionError("No instances for you!");
    }

    public static int addModifier(int modifiers, int mod) {
        return modifiers | mod;
    }

    public static boolean hasModifier(int modifiers, int modifier) {
        return (modifiers & modifier) != 0;
    }

    public static boolean isAbstract(int modifiers) {
        return (modifiers & ABSTRACT) != 0;
    }

    public static boolean isFinal(int modifiers) {
        return (modifiers & FINAL) != 0;
    }

    public static boolean isNative(int modifiers) {
        return (modifiers & NATIVE) != 0;
    }

    public static boolean isPrivate(int modifiers) {
        return (modifiers & PRIVATE) != 0;
    }

    public static boolean isProtected(int modifiers) {
        return (modifiers & PROTECTED) != 0;
    }

    public static boolean hasPackageLevelAccess(int modifiers) {
        return !isPublic(modifiers) && !isProtected(modifiers) && !isPrivate(modifiers);
    }

    public static boolean isPublic(int modifiers) {
        return (modifiers & PUBLIC) != 0;
    }

    public static boolean isStatic(int modifiers) {
        return (modifiers & STATIC) != 0;
    }

    public static boolean isStrictfp(int modifiers) {
        return (modifiers & STRICTFP) != 0;
    }

    public static boolean isSynchronized(int modifiers) {
        return (modifiers & SYNCHRONIZED) != 0;
    }

    public static boolean isTransient(int modifiers) {
        return (modifiers & TRANSIENT) != 0;
    }

    public static boolean isVolatile(int modifiers) {
        return (modifiers & VOLATILE) != 0;
    }

    public static int removeModifier(int modifiers, int mod) {
        return modifiers & ~mod;
    }

    public static int parseModifier(String text) {
        final int modifier;

        if ("public".equals(text) || text.length() == 0) {
            modifier = PUBLIC;
        } else if ("package".equals(text)) {
            modifier = PACKAGE;
        } else if ("protected".equals(text)) {
            modifier = PROTECTED;
        } else if ("private".equals(text)) {
            modifier = PRIVATE;
        } else if ("final".equals(text)) {
            modifier = FINAL;
        } else if ("static".equals(text)) {
            modifier = STATIC;
        } else if ("native".equals(text)) {
            modifier = NATIVE;
        } else if ("abstract".equals(text)) {
            modifier = ABSTRACT;
        } else {
            throw new RuntimeException("Unknow modifier " + text);
        }

        return modifier;
    }
}
