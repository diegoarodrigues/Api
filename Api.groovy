node {
    stage("VerificaSeTemBuild"){
      echo VerificaDir("C:\\PublishApi");
    }
    stage("build") {
        //if(VerificaSeTemBuild){
        echo "build"
        //}
    }
    stage("teste"){
        echo "teste"
        
    }
    //bat "powershell -noprofile -command \"$ErrorActionPreference = 'Stop'; Set-PsDebug -Strict; C:\\Works\\PowerShell_testeJenkins\\Teste1.ps1\""
    //bat "powershell C:\\Works\\PowerShell_testeJenkins\\Teste1.ps1"

}

@NonCPS
def VerificaDir(folder) { 
    
    def count = 0;
    
    new File(folder).eachFile() { file->
     //println file.getAbsolutePath();
     count = count + 1;
    } 
    
    if (count>0){
        //echo "ok";
        return "ok";
    }
    else {
        //echo "1";
        return "error";
    }
}
      
      