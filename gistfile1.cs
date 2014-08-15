using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = "The possibility exists for an impostor to simultaneously steal both the ticket and the authenticator and use them during the 2 minutes the authenticator is valid. This is very difficult but not impossible. To solve this problem with Kerberos 5, Replay Cache has been introduced. In application servers (but also in TGS), there exists the capacity to remember authenticators which have arrived within the last 2 minutes, and to reject them if they are replicas. With this the problem is resolved as long as the impostor is not smart enough to copy the ticket and authenticator and make them arrive at the application server before the legitimate request arrives. This really would be a hoax, since the authentic user would be rejected while the impostor would have access to the service.";
            string[] suffixes = { "less", "ful", "dom","ed" ,"ness"};

            char[] stringSeparators = new char[] { ' ', '?', ',', '.', '"', '"', '#', '(', ')', '{', '}', '&', '%', '@', '=', '+', '-', '_', '*', '/', '|', ':', ';', '$', '\\', '[', ']' };
            string result = "";

            string[] instances = input.Split(stringSeparators, StringSplitOptions.RemoveEmptyEntries);

            foreach (string instance in instances)
            {
                foreach (string suffix in suffixes)
                {
                    if (Regex.IsMatch(instance, suffix+"$"))
                    {
                        result = Regex.Replace(instance, suffix, "", RegexOptions.None);
                        Console.WriteLine(result);
                    }
                }
            }
            Console.WriteLine("The job is done");
            Console.Read();
        }
    }
}
