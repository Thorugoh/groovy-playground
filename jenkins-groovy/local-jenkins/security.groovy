#!groovy
 
import jenkins.model.*
import hudson.security.*
import jenkins.model.JenkinsLocationConfiguration
import net.sf.json.JSONObject

def instance = Jenkins.getInstance()
String admin_email = System.getenv('JENKINS_ADMIN_EMAIL') ?: 'admin@localhost'
String admin_username = System.getenv('JENKINS_ADMIN_USER') ?: 'admin'
String admin_password = System.getenv('JENKINS_ADMIN_PASSWORD') ?: 'admin'

JenkinsLocationConfiguration location = instance.getExtensionList('jenkins.model.JenkinsLocationConfiguration')[0]
 
def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount(admin_username, admin_password)
instance.setSecurityRealm(hudsonRealm)
 
def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
instance.setAuthorizationStrategy(strategy)
println "Updating Jenkins Email to: ${admin_email}"
location.adminAddress = admin_email
instance.save()
location.save()