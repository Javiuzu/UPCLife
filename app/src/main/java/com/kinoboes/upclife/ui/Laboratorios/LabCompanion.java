package com.kinoboes.upclife.ui.Laboratorios;

public class LabCompanion {

    private String name;
    private String comment;
    public enum Assigs{F, FM, IC, PRO1, EC, M1, M2, PRO2, BD, CI, EDA, PE, SO,
        AC, EEE, IDI, IES, XC, PAR, PROP, A, G, IA, LI, LP, TC, AA, APA, CAIM,
        CL, CN, IO, SID, AC2, DSBM, MP, PEC, SO2, XC2, CASO, CPD, PAP, PCA, PDS, STR, VLSI,
        AS, ASW, DBD, ER, GPS, PES, CAP, CBDE, CSI, ECSDI, SIM, SOAD, ADEI, DSI, NE, PSI,
        SIO, ABD, EDO, MI, VPE, ASO, PI, PTI, SI, SOA, TXC, AD, IM, SDX, TCI,
        APC, APSS, ASDP, ASMI, C, CCQ, CDI, DCS, FDM, FOMAR, GCS, GEOC, MD, PAE, ROB, SLDS, TGA, VC,
        VJ, WSE} ;
    private Assigs assig;

    public LabCompanion(String Name, Assigs Assig) {
        name = Name;
        assig = Assig;
        comment = null;
    }
    public LabCompanion(String Name, Assigs Assig, String Comment) {
        name = Name;
        comment = Comment;
        assig = Assig;
    }

    public String getComment() {
        return comment;
    }

    public String getName() {
        return name;
    }

    public Assigs getAssig() {
        return assig;
    }


}
