/*
 * Copyright 2011-2011 Gregory Shrago
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.erlang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: gregory
 * Date: 13.07.11
 * Time: 22:46
 */
public class ErlangFileType extends LanguageFileType {

  public static ErlangFileType INSTANCE = new ErlangFileType();

  protected ErlangFileType() {
    super(ErlangLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Erlang";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Erlang";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "erl";
  }

  @Override
  public Icon getIcon() {
    return ErlangIcons.FILE;
  }

  @Override
  public boolean isJVMDebuggingSupported() {
    // turn off for now
    return false;
  }
}
