/*
 * Copyright 2018 walmart.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.erik.holamundo.models;

import java.util.Date;

/**
 *
 * @author walmart
 */
public class Persona {
      private String IDPersona;
    private String strNombre;
    private String strAPaterno;
    private String strAMaterno;
    private int IDCatSexo;
    private Date DateFechaN;
    
    /**
     * @return the IDPersona
     */
    public String getIDPersona() {
        return IDPersona;
    }

    /**
     * @param IDPersona the IDPersona to set
     */
    public void setIDPersona(String IDPersona) {
        this.IDPersona = IDPersona;
    }

    /**
     * @return the strNombre
     */
    public String getStrNombre() {
        return strNombre;
    }

    /**
     * @param strNombre the strNombre to set
     */
    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    /**
     * @return the strAPaterno
     */
    public String getStrAPaterno() {
        return strAPaterno;
    }

    /**
     * @param strAPaterno the strAPaterno to set
     */
    public void setStrAPaterno(String strAPaterno) {
        this.strAPaterno = strAPaterno;
    }

    /**
     * @return the strAMaterno
     */
    public String getStrAMaterno() {
        return strAMaterno;
    }

    /**
     * @param strAMaterno the strAMaterno to set
     */
    public void setStrAMaterno(String strAMaterno) {
        this.strAMaterno = strAMaterno;
    }

    /**
     * @return the IDCatSexo
     */
    public int getIDCatSexo() {
        return IDCatSexo;
    }

    /**
     * @param IDCatSexo the IDCatSexo to set
     */
    public void setIDCatSexo(int IDCatSexo) {
        this.IDCatSexo = IDCatSexo;
    }

    /**
     * @return the DateFechaN
     */
    public Date getDateFechaN() {
        return DateFechaN;
    }

    /**
     * @param DateFechaN the DateFechaN to set
     */
    public void setDateFechaN(Date DateFechaN) {
        this.DateFechaN = DateFechaN;
    }

    
}