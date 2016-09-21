/**
 * Copyright (C) 2014 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package de.ibacg.intellij.folding;

import com.intellij.lang.folding.CustomFoldingProvider;

/**
 * Provides folding for code regions marked with // {{ ... // }}
 */
public class DoubleCurlyBracesFoldingProvider extends CustomFoldingProvider {

  @Override
  public boolean isCustomRegionStart(String elementText) {
    return elementText.contains("// {{");
  }

  @Override
  public boolean isCustomRegionEnd(String elementText) {
    return elementText.contains("// }}");
  }

  @Override
  public String getPlaceholderText(String s) {
    return s;
  }

  @Override
  public String getDescription() {
    return "Eclipse Folding";
  }

  @Override
  public String getStartString() {
    return "// {{";
  }

  @Override
  public String getEndString() {
    return "// }}";
  }
}
