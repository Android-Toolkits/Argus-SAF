/*
 * Copyright (c) 2017. Fengguo Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */
package parser.expr.binaryexpr;

public class NOT_EQUALS {
    static int i = 2;
    static int j = 3;
    public static boolean main() {
        return i != j;
    }
}