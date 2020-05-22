package com.Mikkel;

import Controller.Controller;
import Machine.FilHåndtering;
import Machine.Klubben;
import Machine.SvømmerInformationer;
import UI.UserInterface;
import Økonomi.Kontigentberegner;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Controller run = new Controller();

        run.indlæsAlleSvømmereNårProgrammetStarter();

        run.præsenterMenuForbrugeren();





    }
}